package uk.ac.soton.ldanalytics.piotre.server;

import static spark.Spark.get;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;
import freemarker.cache.ClassTemplateLoader;

public class PiotreServer {
	public static void main(String[] args) {
		FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine();
		freemarker.template.Configuration freeMarkerConfiguration = new freemarker.template.Configuration();
		freeMarkerConfiguration.setTemplateLoader(new ClassTemplateLoader(PiotreServer.class, "/templates"));
		freeMarkerEngine.setConfiguration(freeMarkerConfiguration);
		Spark.staticFileLocation("/public");
		
		get("/", (req, res) -> {        	
	    	Map<String, Object> attributes = new HashMap<>();
	    	return freeMarkerEngine.render(new ModelAndView(attributes, "index.ftl"));
	    });
	}
}

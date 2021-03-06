# PIOTRe
Personal IoT Repository based on sparql2sql, sparql2stream and sparql2fed technologies. The name PIOTRe is also derived from the name Peter meaning "stone" or "rock" and is the foundation for applications built on interoperable and efficient database technology on lightweight IoT devices.

![alt text](https://cloud.githubusercontent.com/assets/9078335/16585548/5e10ee14-42b9-11e6-9935-936efe4e27dd.png "Architecture of PIOTRe")

PIOTRe essentially consists of a sink for IoT data streams which flows to an events stream and a historical store and allows applications to be built on top with any programming language and framework. Historical data can be queried via a HTTP SPARQL endpoint while queries on streaming data can be registered most efficiently via the underlying ZeroMQ sockets by publishing streaming SPARQL query to a broker.

Mappings in [S2SML](https://github.com/eugenesiow/sparql2sql/wiki/S2SML) have to be made as it's a necessary step for interoperability with other PIOTRe and semantic web systems.

See [PIOTRe-web](https://github.com/eugenesiow/PIOTRe-web) for a frontend for PIOTRe to aid in adding data sources, apps, creating mappings and publishing metadata.

Most information about sparql2sql can be found on the [wiki](https://github.com/eugenesiow/sparql2sql/wiki). 
This includes a reference for the [S2SML](https://github.com/eugenesiow/sparql2sql/wiki/S2SML) language for sparql2sql mappings, [benchmarks](https://github.com/eugenesiow/sparql2sql/wiki/Benchmarks), implementation of the [swappable BGP resolution interface](https://github.com/eugenesiow/sparql2sql/wiki/SWIBRE), etc.

### Other Projects
* [LSD-ETL](https://github.com/eugenesiow/lsd-ETL)
* [sparql2sql](https://github.com/eugenesiow/sparql2sql)
* [sparql2stream](https://github.com/eugenesiow/sparql2stream)
* [sparql2sql-server](https://github.com/eugenesiow/sparql2sql-server)
* [sparql2fed](https://github.com/eugenesiow/sparql2fed)
* [UNIOTE](https://github.com/eugenesiow/uniote-node)
* [Linked Data Analytics](http://eugenesiow.github.io/iot/)

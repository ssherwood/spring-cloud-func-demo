

## HTTPie

* `echo "Shawn" | http :8080`


## Observations

* Heap allocation directly impacts cold startup times (more heap == faster cold starts up to ~2GB);  Heap allocation
 affects the # of "free" calls per month.
* JVM startup in vanilla "Java 8" plan can't be configured so you can't disable/delay things like the internal JIT
 compiler which impacts startup
* 


## Artifact Sizes

* Vanilla "web"
  * **18M** Jul 28 13:29 demo-func-0.0.1-SNAPSHOT.jar
  * Started DemoFuncApplication in **1.69** seconds (JVM running for 2.017)
* Vanilla "webflux"
  * **19M** Jul 28 13:34 demo-func-0.0.1-SNAPSHOT.jar
  * Started DemoFuncApplication in **1.636** seconds (JVM running for 1.96)
* Functional "webflux"
  * **19M** Jul 28 14:09 demo-func-0.0.1-SNAPSHOT.jar
  * Started DemoFuncApplication in **0.642** seconds

| Annotation | Heap | Size | Startup |
| ---------- | ---: | ---: | ------: |
| @SpringBootConfiguration | 1024M | 17M | 2.38 |
| @SpringBootConfiguration | 512M | 17M | 8.42 |
| @SpringBootConfiguration | 768M | 17M | 5.19 |
| @SpringBootConfiguration | 832M | 17M | 4.91 |
| @SpringBootConfiguration | 896M | 17M | 4.30 |
| @SpringBootConfiguration | 960M | 17M | 4.30 |
| @SpringBootConfiguration | 1024M | 17M | 3.97 |
| @SpringBootConfiguration | 2048M | 17M | 1.94 |
| @SpringBootConfiguration | 3008M | 17M | 1.55 |
| @SpringBootApplication | 1024M | 17M | 2.35 |
| @SpringBootApplication | 512M | 17M | 8.54 |
| @SpringBootApplication | 768M | 17M | 5.42 |
| @SpringBootApplication | 832M | 17M | 4.97 |
| @SpringBootApplication | 896M | 17M | 4.65 |
| @SpringBootApplication | 960M | 17M | 4.23 |
| @SpringBootApplication | 1024M | 17M | 3.98 |
| @SpringBootApplication | 1536M | 17M | 2.61 |
| @SpringBootApplication | 2048M | 17M | 1.93 |
| @SpringBootApplication | 3008M | 17M | 1.56 |

## Concepts to think about...

- Security 
  - Adding Spring Security is heavy, AWS assumes you'll do this via their API Gateway?
  - If you need complex security features, maybe Lambda isn't the right usecase?

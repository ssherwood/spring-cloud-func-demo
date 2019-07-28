

## HTTPie

* `echo "Shawn" | http :8080`



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




## Concepts to think about...

- Security 
  - Adding Spring Security is heavy, AWS assumes you'll do this via their API Gateway?
  - If you need complex security features, maybe Lambda isn't the right usecase?

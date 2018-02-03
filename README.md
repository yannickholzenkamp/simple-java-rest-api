# simple-java-rest-api
This is a simple java project providing a REST API. 
The WAR file created by Maven can be deployed on the the Application Server of your choice (the context root will only be set on Wildfly/JBoss).
After the deployment, the following URL will return a JSON response:
```
WildFly / JBoss:
http://localhost:8080/simpleapp/service/test

Other application servers:
http://<your-application-server>/<your-context-root>/service/test
```

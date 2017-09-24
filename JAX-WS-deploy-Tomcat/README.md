[Deploy JAX-WS application on Tomcat](http://memorynotfound.com/deploy-jaxws-application-tomcat-example)


###Зависимости JAX-WS
По умолчанию Tomcat не имеет никаких JAX-WS зависимостей, поэтому вы должны включить его вручную.

1. Пройдите по ссылке [http://jax-ws.java.net](http://jax-ws.java.net)
2. Скачайие [JAX-WS RI](https://mvnrepository.com/artifact/com.sun.xml.ws/jaxws-ri) ([2.2.7](http://central.maven.org/maven2/com/sun/xml/ws/jaxws-ri/2.2.7/jaxws-ri-2.2.7.zip)) дистрибютив
3. Распакуйте его и скопируйте JAX-WS зависимости в Tomcat папку библиотек '{$TOMCAT}/lib'
`jaxb-impl.jar`
`jaxws-api.jar`
`jaxws-rt.jar`
`gmbal-api-only.jar`
`management-api.jar`
`stax-ex.jar`
`streambuffer.jar`
`policy.jar`


- PORT: `8080`
- BUILD-NAME: `jaxws-tomcat`
- URL: [http://localhost:8080/jaxws-tomcat/greeting?wsdl](http://localhost:8080/jaxws-tomcat/greeting?wsdl) ([http://localhost:8080/jaxws-tomcat/greeting](http://localhost:8080/jaxws-tomcat/greeting))
- `cd C:\Program Files (x86)\Java\jdk1.8.0_31\bin`
- `wsimport -d D:\IdeaProjects\twinwingames\PROD\____\src http://localhost:8080/jaxws-tomcat/greeting?wsdl -Xnocompile`



https://examples.javacodegeeks.com/enterprise-java/jws/jax-ws-web-services-on-tomcat
https://stackoverflow.com/questions/30846441/how-to-deploy-soap-web-service-on-tomcat-7 >> http://www.mkyong.com/webservices/jax-ws/deploy-jax-ws-web-services-on-tomcat

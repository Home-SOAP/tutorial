package com.mkyong.client;

import com.mkyong.ws.HelloWorld;
import com.mkyong.ws.HelloWorldImplService;

/**
 * @see https://www.mkyong.com/webservices/jax-ws/jax-ws-hello-world-example
 *      *****************************
 * run 'Endpoint' (HelloWorldService)
 * cd C:\Program Files (x86)\Java\jdk1.8.0_31\bin
 * wsimport -d D:\IdeaProjects\twinwingames\PROD\tutorial\JAX-WS-HelloWorld\WebClient\src http://localhost:8080/ws/hello?wsdl -Xnocompile
 */
public class HelloWorldClient {
	private static HelloWorldImplService service;

	public static void main(String[] args) {
		service = new HelloWorldImplService();
		HelloWorld hello = service.getHelloWorldImplPort();

		System.out.println( hello.getHelloWorldAsString("mkyong") );
    }

}

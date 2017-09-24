package com.mkyong.ws;
 
import javax.jws.WebService;

/**
 * Service Implementation
 */

// но здесь используется с параметром endpointInterface, указывающим полное имя класса интерфейса нашего веб-сервиса
@WebService(endpointInterface = "com.mkyong.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello JAX-WS: " + name;
	}
}

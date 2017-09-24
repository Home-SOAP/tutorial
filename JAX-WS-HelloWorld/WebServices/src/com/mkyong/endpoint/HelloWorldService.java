package com.mkyong.endpoint;
 
import javax.xml.ws.Endpoint;
import com.mkyong.ws.HelloWorldImpl;

/**
 * @see https://www.mkyong.com/webservices/jax-ws/jax-ws-hello-world-example
 *      http://info.javarush.ru/eGarmin/2015/03/14/Веб-сервисы-Шаг-1-Что-такое-веб-сервис-и-как-с-ним-работать-.html
 *      *************
 * Endpoint publisher
 */
public class HelloWorldService {

	public static void main(String[] args) {
		// запускаем веб-сервер на порту '8080' и по адресу, указанному в первом аргументе, запускаем веб-сервис, передаваемый во втором аргументе
		Endpoint.publish("http://localhost:8080/ws/hello", new HelloWorldImpl());
    }

}
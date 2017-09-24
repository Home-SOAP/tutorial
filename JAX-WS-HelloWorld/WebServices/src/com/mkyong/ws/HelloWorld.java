package com.mkyong.ws;
 
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Service Endpoint Interface
 */

// говорим что наш интерфейс будет работать как веб-сервис
@WebService
// говорим что веб-сервис будет использоваться для вызова методов
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWorld {
	// говорим что этот метод можно вызывать удаленно
	@WebMethod
	String getHelloWorldAsString(String name);
}

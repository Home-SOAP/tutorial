package com.memorynotfound.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.memorynotfound.ws.GreetingService")
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String printMessage() {
        return "Hello World!";
    }

}

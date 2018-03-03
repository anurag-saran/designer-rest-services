package com.codemiro.containerplay.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Path("/hello")
@Component
public class LoginResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "Hello World";
    }
    
    @Path("/login/success")
    public String loginSuccess() {
    	
    	return "success";
    }

}

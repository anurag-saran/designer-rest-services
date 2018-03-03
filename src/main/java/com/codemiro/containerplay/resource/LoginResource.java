package com.codemiro.containerplay.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Path("/login")
@Component
public class LoginResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String login() {
        return "say login";
    }
    

}

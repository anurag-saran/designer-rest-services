package com.codemiro.containerplay.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.codemiro.containerplay.resource.LoginResource;

@Component
@ApplicationPath("/v1")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(LoginResource.class);
    }
}

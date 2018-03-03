package com.codemiro.containerplay.config;

import org.springframework.core.env.Environment;
import org.springframework.social.UserIdSource;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.SocialConfigurer;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.linkedin.connect.LinkedInConnectionFactory;

//@Configuration
//@EnableSocial
public class SocialConfig implements SocialConfigurer {
	
	@Override
	    public void addConnectionFactories(ConnectionFactoryConfigurer connectionFactoryConfigurer, Environment environment) {
	        connectionFactoryConfigurer.addConnectionFactory(new LinkedInConnectionFactory(
	            environment.getProperty("spring.social.linkedin.app-id"),
	            environment.getProperty("spring.social.linkedin.app-secret")));
	       
	    }

	@Override
	public UserIdSource getUserIdSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsersConnectionRepository getUsersConnectionRepository(ConnectionFactoryLocator connectionFactoryLocator) {
		// TODO Auto-generated method stub
		return null;
	}

}

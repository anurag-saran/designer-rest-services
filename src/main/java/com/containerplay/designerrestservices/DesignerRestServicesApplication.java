package com.containerplay.designerrestservices;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
//1. Indicates its a spring context file
//2. Enables auto-configuration  
//3. component scan.  Scans this and sub package for beans.
@SpringBootApplication
public class DesignerRestServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignerRestServicesApplication.class, args);
	}
}

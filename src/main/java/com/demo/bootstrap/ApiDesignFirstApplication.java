package com.demo.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.demo.bootstrap", "com.demo.bootstrap.controller" , "com.demo.bootstrap.config.openapi"})
public class ApiDesignFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDesignFirstApplication.class, args);
	}

}

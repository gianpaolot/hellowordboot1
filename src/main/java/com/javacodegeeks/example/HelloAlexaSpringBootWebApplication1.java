package com.javacodegeeks.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
// @Import(AlexaConfiguration.class)
public class HelloAlexaSpringBootWebApplication1 extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HelloAlexaSpringBootWebApplication1.class);
	}

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/hello");
		SpringApplication.run(HelloAlexaSpringBootWebApplication1.class, args);
	}

}

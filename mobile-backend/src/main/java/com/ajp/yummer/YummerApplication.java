package com.ajp.yummer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class YummerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(YummerApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(YummerApplication.class);
	}

	@PostConstruct
	public void init() {
		System.out.println("Initializing Application Context...");
	}
}

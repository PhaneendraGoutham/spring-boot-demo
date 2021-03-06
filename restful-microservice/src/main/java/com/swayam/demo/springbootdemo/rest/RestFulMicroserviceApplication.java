package com.swayam.demo.springbootdemo.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.swayam.demo.springbootdemo.rest" })
public class RestFulMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFulMicroserviceApplication.class, args);
	}
}

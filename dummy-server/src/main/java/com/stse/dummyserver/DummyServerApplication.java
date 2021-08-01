package com.stse.dummyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DummyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DummyServerApplication.class, args);
	}

}

package com.authorization.jwttoken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JwttokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwttokenApplication.class, args);
	}

}

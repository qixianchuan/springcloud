package com.qi.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class QiServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(QiServiceProviderApplication.class, args);
	}

}

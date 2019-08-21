package com.qi.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 声明当前springboot应用是一个eureka服务中心
public class QiEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(QiEurekaApplication.class, args);
	}

}

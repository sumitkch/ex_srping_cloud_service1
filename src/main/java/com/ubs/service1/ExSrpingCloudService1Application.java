package com.ubs.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ExSrpingCloudService1Application {

	public static void main(String[] args) {
		SpringApplication.run(ExSrpingCloudService1Application.class, args);
	}

}

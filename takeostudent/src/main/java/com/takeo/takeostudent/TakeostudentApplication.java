package com.takeo.takeostudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.takeo")
@EnableDiscoveryClient
public class TakeostudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(TakeostudentApplication.class, args);
	}

}

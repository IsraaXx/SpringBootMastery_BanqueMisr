package com.sprints.SpringBoot_Fundamentals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SpringBootFundamentalsApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootFundamentalsApplication.class, args);
	}

}

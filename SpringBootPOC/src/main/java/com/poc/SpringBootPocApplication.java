package com.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.poc")
public class SpringBootPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPocApplication.class, args);

	}
}

package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestApp {

	public static void main(String[] args) {
		SpringApplication.run(TestApp.class, args);
		//ApplicationContext context=SpringApplication.run(TestApp.class, args); 
		/*for(String s:context.getBeanDefinitionNames()) {
			
			System.out.println(s);
		}*/

	}

}

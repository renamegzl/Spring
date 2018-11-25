package com.example.demo.annn;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.Application;

@SpringBootApplication
public class Ann {
	public static void main(String[] args)  {
		
		
		System.out.println("start");
		System.out.println();
		SpringApplication.run(Ann.class, args);
		System.out.println("end");
	}
	
//	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
//	@PostConstruct
//	public void queryObligations() {  
//		LOGGER.debug("query obligations start...");  
//		LOGGER.error("An error occurred during the query");  
//		LOGGER.debug("query obligations end...");  
//    }  
	
	@Bean
	public static CommandLineRunner testA() {
		CommandLineRunner runner =new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				System.out.println("init");
				
			}
		};
		return runner;
	}

}

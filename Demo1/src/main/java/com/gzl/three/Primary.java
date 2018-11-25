package com.gzl.three;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.gzl.three")
public class Primary {
	@Bean
	public Second first() {
		System.out.println("first");
		return new Second();
	}
	
	@Bean
	@org.springframework.context.annotation.Primary
	public Second second() {
		System.out.println("second");
		return new Second();
	}
	
}

package com.example.demo.annn;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;


@PropertySource(value="classpath:text.properties")//自定义

@ConfigurationProperties(prefix ="fix")
@Data
@Configuration
public class Student {
	private String name;
	private int age;
	private String sex;
	
	
	
	
	
}

package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"default","hello","dev"})
public class HelloWorldService implements MessageService{

	@Value("${name1:World}")
	private String name;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello"+this.name;
	}

}

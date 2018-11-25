package com.gzl.two;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class TwoBean {
	@Value("这是TwoBean")
	private String name="这是OneBean你信么";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

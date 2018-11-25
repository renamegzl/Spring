package com.gzl.three;

import org.springframework.stereotype.Component;

@Component
public class Second {
	private String name="name";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Second [name=" + name + "]";
	}
	
}

package com.gzl.two;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class OneBean {
	private String name="这是oneBean";
	
	private SumBean sumBean;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "OneBean [name=" + name + "]";
	}

	public SumBean getSumBean() {
		return sumBean;
	}
	
	
	
}

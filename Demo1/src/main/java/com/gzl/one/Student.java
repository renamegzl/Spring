package com.gzl.one;

public class Student {
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

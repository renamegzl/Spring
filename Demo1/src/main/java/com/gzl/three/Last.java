package com.gzl.three;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component

public class Last {
	@Autowired
	private Second Test;
	

	public Last() {
		super();
	}

	
	public Last(Second test) {
		super();
		Test = test;
	}


	public Second getTest() {
		return Test;
	}

	public void setTest(Second test) {
		Test = test;
	}

	@Override
	public String toString() {
		return "Last [Test=" + Test + "]";
	}
	
	
}

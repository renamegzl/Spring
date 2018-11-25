package com.gzl.one;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
	}
	
	@Test
	public void test() {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Object bean = context.getBean("student");
		System.out.println(bean.toString());
		((AbstractApplicationContext) context).registerShutdownHook();
	}
	
}

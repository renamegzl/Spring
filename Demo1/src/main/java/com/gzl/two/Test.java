package com.gzl.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.gzl.one.Student;
import com.gzl.three.Last;

import sun.security.action.GetBooleanAction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:application-context.xml");
		
		int count = context.getBeanDefinitionCount();
		System.out.println("bean的个数:"+ count);
		String[] names = context.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name+ "");
			Object bean = context.getBean(name);
			System.out.println(bean.getClass());
		}
		
		String zz = context.getBean("sumBean",SumBean.class).toString();
		System.out.println(zz);
		

		
		
		

	}

}

package com.gzl.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gzl.one.Student;
import com.gzl.two.OneBean;
import com.gzl.two.SumBean;


public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
		OneBean bean1=(OneBean) context.getBean("getOneBean");
		System.out.println(bean1);
		
		
		AnnotationConfigApplicationContext context1=new AnnotationConfigApplicationContext();
		context1.scan("com.gzl.three");
		context1.refresh();
		String zz = context1.getBean(Last.class).toString();
		System.out.println(zz);
	}
}

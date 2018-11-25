package com.gzl.one;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeBean implements InitializingBean,DisposableBean{

	public void start() {
		System.out.println("这是start");
	}
	
	public void stop() {
		System.out.println("这是stop");
	}
	
	
	public void destroy() throws Exception {
		System.out.println("这是destory");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("这是afterPropertiesSet");
		
	}

}

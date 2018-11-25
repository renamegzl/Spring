package com.example.demo;

import java.util.Arrays;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.ServletRequestHandledEvent;

import com.example.demo.annn.Student;
import com.example.demo.service.HelloWorldService;

@SpringBootApplication
@RestController
public class Application {
	
	@Autowired
	Student student;
	
	@Autowired
	private HelloWorldService hello;
	
	@Value("${name}")
	private String name;
//	@Value("${my.name}")
//	private String myname;
	

	
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	
	@PostConstruct
	public void queryObligations() {  
		LOGGER.debug("Sample Debug Message");
		LOGGER.info("Sample info Message");
		LOGGER.trace("Sample trace Message");
		LOGGER.error("Sample error Message");
		LOGGER.warn("Sample warn Message");  
    }
	
	
	
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello,world!"+name;
	}
	
	@RequestMapping("/stu")
	public String student() {
		return student.toString();
	}
	
	public static void main(String[] args) {
//		LOGGER.info("SpringBoot开始加载");
		SpringApplication.run(Application.class, args);
//		LOGGER.info("SpringBoot加载完毕");
	}
	
	@Bean
	public ApplicationRunner oppRunner() {
		return args ->{
			System.out.println();
			System.out.println("ApplicationRunner: ");
			for (String opt : args.getOptionNames()) {
				System.out.println(opt);
				System.out.println("->");
				System.out.println(args.getOptionValues(opt).stream().collect(Collectors.joining(opt)));
				
			}
		};
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args ->{
			System.out.println("list:bean" + ctx.getBeanDefinitionCount());
			
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String string : beanNames) {
				System.out.println(beanNames);
			}
		};
	}
	
	@Bean
	public ApplicationListener<ApplicationEvent> hellolistener(){
		final String HEELO_URL = "/hello";
		return (ApplicationEvent event) -> {
			if (event instanceof ServletRequestHandledEvent) {
				ServletRequestHandledEvent e = (ServletRequestHandledEvent) event;
				if (e.getRequestUrl().equals(HEELO_URL)) {
					System.out.println("visit hello");
					System.out.println(hello.getMessage());
				}
				
			}
		};
	}
	
	
}

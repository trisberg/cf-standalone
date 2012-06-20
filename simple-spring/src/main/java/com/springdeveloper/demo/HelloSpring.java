package com.springdeveloper.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;

public class HelloSpring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = 
				new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
		ExampleService service= ctx.getBean(ExampleService.class);
		
		while (true) {
			System.out.println("Java Version:   " + System.getProperty("java.version"));
			System.out.println("Spring Version: " + SpringVersion.getVersion());
			System.out.println("Service says:   " + service.getMessage());
			System.out.println("...");
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {}
		}

	}

}

package com.springdeveloper.demo;

import org.springframework.core.SpringVersion;

public class HelloJava {

	public static void main(String[] args) {
		while (true) {
			System.out.println("Plain Java");
			System.out.println("Java Version: " + System.getProperty("java.version"));
			System.out.println("Spring Version: " + SpringVersion.getVersion());
			System.out.println("PATH: " + System.getenv("PATH"));
			System.out.println("...");
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {}
		}
	}

}

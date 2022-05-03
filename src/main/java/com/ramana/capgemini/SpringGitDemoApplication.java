package com.ramana.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGitDemoApplication.class, args);
		System.out.println("Hello Ramana");
	}

	// Chnages of HIS-134
	public void m1() {
		System.out.println("i am chnages of HIS-134");
	}
}

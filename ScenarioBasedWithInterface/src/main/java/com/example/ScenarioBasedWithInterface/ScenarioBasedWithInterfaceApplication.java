package com.example.ScenarioBasedWithInterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScenarioBasedWithInterfaceApplication {

	public static void main(String[] args) {

		//SpringApplication.run(ScenarioBasedWithInterfaceApplication.class, args);

		System.setProperty("server.port","8080");

		ApplicationContext context = SpringApplication.run(ScenarioBasedWithInterfaceApplication.class, args);

		XYZ xyz = context.getBean(XYZ.class);

		xyz.show();

		System.out.println("hello");
	}

}

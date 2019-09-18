package com.random.number.rng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RngApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(RngApplication.class, args);
		TimePublisher timePublisher = applicationContext.getBean(TimePublisher.class);
		Thread thread = new Thread(timePublisher);
		thread.start();


	}

}

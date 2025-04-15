package com.shreyash.paper_trading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaperTradingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaperTradingApplication.class, args);
		System.out.println("Application is live");
	}

}

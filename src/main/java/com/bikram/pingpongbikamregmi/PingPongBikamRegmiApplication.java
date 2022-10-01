package com.bikram.pingpongbikamregmi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.bikram.pingpongbikamregmi.controller")
public class PingPongBikamRegmiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PingPongBikamRegmiApplication.class, args);
	}

}

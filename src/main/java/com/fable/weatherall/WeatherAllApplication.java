package com.fable.weatherall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@ComponentScan(basePackages = "com.fable.weatherall")
public class WeatherAllApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherAllApplication.class, args);
	}

}

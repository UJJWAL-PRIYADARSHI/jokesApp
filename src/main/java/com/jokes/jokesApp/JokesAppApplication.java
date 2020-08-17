package com.jokes.jokesApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

//@ImportResource("config.xml")
@ComponentScan(basePackages = {"com.jokes.config", "com.jokes.jokesApp"})
@SpringBootApplication
public class JokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesAppApplication.class, args);
	}

}

package com.megamart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.megamart"})
public class MegaMartApplication {

	public static void main(String[] args) {
		SpringApplication.run(MegaMartApplication.class, args);
	}

}

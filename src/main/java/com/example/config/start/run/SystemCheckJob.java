package com.example.config.start.run;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value=2)
public class SystemCheckJob implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("SystemCheckJob value 2");
	}

}

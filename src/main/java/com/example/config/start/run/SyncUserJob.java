package com.example.config.start.run;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value=5)
public class SyncUserJob implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("SyncUserJob value 5");
	}

}

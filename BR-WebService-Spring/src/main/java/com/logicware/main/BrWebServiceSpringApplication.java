package com.logicware.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class BrWebServiceSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrWebServiceSpringApplication.class, args);
	}
}

@Component
class CommandLineRun implements CommandLineRunner{

	@Override
	public void run(String... arg0) throws Exception {
		// Nothing
	}
}

package com.logicware.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.logicware.entities.User;
import com.logicware.repositories.UserRepository;

@EnableWebMvc
@SpringBootApplication
@EnableJpaRepositories(basePackages="com.logicware.repositories")
@EntityScan(basePackages={"com.logicware.entities"})
@ComponentScan(basePackages={"com.logicware.controllers", "com.logicware.repositories", "com.logicware.entities"})
public class BrWebServiceSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrWebServiceSpringApplication.class, args);
	}
}

/*@Component
class CommandLineRun implements CommandLineRunner{
	
	@Autowired UserRepository userRepository;

	@Override
	public void run(String... arg0) throws Exception {
		for(User u: userRepository.findAll())
			System.out.println(u.getCorreo());
	}
}*/
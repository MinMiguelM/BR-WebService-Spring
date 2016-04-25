package com.logicware.main;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@SpringBootApplication
@EnableJpaRepositories(basePackages="com.logicware.repositories")
@EntityScan(basePackages={"com.logicware.entities"})
@ComponentScan(basePackages={"com.logicware.controllers", "com.logicware.repositories", "com.logicware.entities"})
@EnableAutoConfiguration
public class BrWebServiceSpringApplication {

	public static void main(String[] args) {
		/*for(int i = 0;i<args.length;i++)
			System.out.println(args[i]);*/
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

@EnableWebMvc
@ComponentScan("org.springframework.security.samples.mvc")
@Configuration
@Component
class WebMvcConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
	}
}
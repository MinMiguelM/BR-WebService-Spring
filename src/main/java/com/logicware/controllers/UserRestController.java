/**
 * 
 */
package com.logicware.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.logicware.entities.User;
import com.logicware.repositories.UserRepository;

/**
 * @author ASUS
 *
 */
@RestController
@RequestMapping("/user")
@ComponentScan("com.logicware.main")
public class UserRestController {
	
	@Autowired private UserRepository userRepository;
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	Collection<User> getAll(){
		return userRepository.findAll();
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	User add(@RequestBody User input){
		return userRepository.save(input);
	}
	
	@RequestMapping(value="getByCorreo/{correo}", method=RequestMethod.GET)
	User getByCorreo(@PathVariable String correo){
		return userRepository.findByCorreo(correo);
	}

}

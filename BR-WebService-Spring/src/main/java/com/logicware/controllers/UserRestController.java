/**
 * 
 */
package com.logicware.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
public class UserRestController {
	
	@Autowired UserRepository userRepository;
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	Collection<User> getAll(){
		return userRepository.findAll();
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	User add(@RequestBody User input){
		return userRepository.save(input);
	}

}

/**
 * 
 */
package com.logicware.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.logicware.entities.Establishment;
import com.logicware.repositories.EstablishmentRepository;

/**
 * @author miguel
 *
 */
@RestController
@RequestMapping("/establishment")
public class EstablishmentRestController {
	
	@Autowired private EstablishmentRepository establishmentRepository;
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	Collection<Establishment> getAll(){
		return establishmentRepository.findAll();
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	Establishment add(@RequestBody Establishment input){
		return establishmentRepository.save(input);
	}
	
}

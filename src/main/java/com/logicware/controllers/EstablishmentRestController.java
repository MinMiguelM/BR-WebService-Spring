package com.logicware.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.logicware.entities.Establishment;
import com.logicware.entities.User;
import com.logicware.repositories.EstablishmentRepository;

/**
 * @author miguel
 *
 */
@RestController
@RequestMapping("/establishment")
public class EstablishmentRestController {
	
	@Autowired private EstablishmentRepository establishmentRepository;
	
	/**
	 * Nombre: getAll
	 * Entradas: -
	 * Salidas: Una lista con todo los establecimientos
	 * Descripcion: dada una solicitud get hecha en establishment/getAll
	 * 				se retonar la lista de todos los establecimientos en el sistema
	 */
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	Collection<Establishment> getAll(){
		return establishmentRepository.findAll();
	}
	
	/**
	 * Nombre: add
	 * Entradas: La entidad establecimiento la cual sera agregada al sistema
	 * Salidas: El establecimiento creado con todas los atributos
	 * Descripcion: dada la solicitud de tipo de POST, el servidor recibe
	 * 				la informacion del establecimiento en tipo JSON y lo agrega
	 * 				al sistema
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	Establishment add(@RequestBody Establishment input){
		return establishmentRepository.save(input);
	}
	
	/**
	 * Nombre: getByName
	 * Entradas: El nombre o parte de el, del establecimiento
	 * Salidas: Una lista con todo los establecimientos con el nombre dado
	 * Descripcion: Dado un nombre como entrada este se encarga de buscar en la
	 * 				base de datos dicho o dichos establecimientos
	 */
	@RequestMapping(value="/getByName/{name}", method=RequestMethod.GET)
	Collection<Establishment> getByName(@PathVariable String name){
		name = "%" + name + "%";
		return establishmentRepository.findByNombre(name);
	}
	
}

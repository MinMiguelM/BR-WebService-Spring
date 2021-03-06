package com.logicware.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.logicware.entities.Establecimiento;
import com.logicware.entities.Usuario;
import com.logicware.repositories.EstablecimientoRepository;
import com.logicware.repositories.UsuarioRepository;

/**
 *	Encargado de recibir los mensajes del cliente. Estos mensajes
 * 	estan relacionados con la entidad Establecimiento
 */
@RestController
@RequestMapping("/establishment")
public class EstablecimientoRestController {
	
	@Autowired private EstablecimientoRepository establishmentRepository;
	
	/**
	 * Nombre: getAll
	 * Entradas: -
	 * Salidas: Una lista con todo los establecimientos
	 * Descripcion: dada una solicitud get hecha en establishment/getAll
	 * 				se retonar la lista de todos los establecimientos en el sistema
	 */
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	Collection<Establecimiento> getAll(){
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
	Establecimiento add(@RequestBody Establecimiento input){
		return establishmentRepository.save(input);
	}
	
	/**
	 * Nombre: getByNombre
	 * Entradas: El nombre o parte de el, del establecimiento
	 * Salidas: Una lista con todo los establecimientos con el nombre dado
	 * Descripcion: Dado un nombre como entrada este se encarga de buscar en la
	 * 				base de datos dicho o dichos establecimientos
	 */
	@RequestMapping(value="/getByNombre/{nombre}", method=RequestMethod.GET)
	Collection<Establecimiento> getByNombre(@PathVariable String nombre){
		nombre = "%" + nombre + "%";
		return establishmentRepository.findByNombre(nombre);
	}
	
	/**
	 * Nombre : update
	 * Entradas: La tupla de la entidad que sera actualizada
	 * Salidas: la tupla actualizada
	 * Descripción: actualiza la tupla que llega en la base de datos.
	 */
	@RequestMapping(value = "/update", method=RequestMethod.POST)
	Establecimiento update(@RequestBody Establecimiento event){
		return establishmentRepository.save(event);
	}
	
	/**
	 * Nombre: getByTipo
	 * Entradas: El tipo ya sea bar o restaurante del establecimiento
	 * Salidas: Una lista con todo los establecimientos del tipo dado
	 * Descripcion: Dado el tipo como entrada este se encarga de buscar en la
	 * 				base de datos dicho o dichos establecimientos
	 */
	@RequestMapping(value = "/getByTipo/{tipo}", method = RequestMethod.GET)
	Collection<Establecimiento> getByTipo(@PathVariable String tipo){
		return establishmentRepository.findByTipo(tipo);
	}
	
	/**
	 * Nombre: getAllByUsuario
	 * Entradas: El id del usuario dueño de los establecimientos
	 * Salidas: Una lista con todo los establecimientos dado un usuario
	 * Descripcion: Dado el id del usuario como entrada este se encarga de buscar en la
	 * 				base de datos dicho o dichos establecimientos
	 */
	@RequestMapping(value = "/getAllByUsuario/{idUsuario}", method = RequestMethod.GET)
	Collection<Establecimiento> getAllByUsuario(@PathVariable Long idUsuario){
		return establishmentRepository.findAllByUsuario(idUsuario);
	}
}

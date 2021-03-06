package com.logicware.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.logicware.entities.Evento;
import com.logicware.entities.Reserva;
import com.logicware.entities.Usuario;
import com.logicware.repositories.ReservaRepository;

/**
 * Encargado de recibir los mensajes del cliente. Estos mensajes
 * estan relacionados con la entidad Reserva
 */
@RestController
@RequestMapping("/booking")
public class ReservaRestController {
	
	@Autowired private ReservaRepository reservaRepository;
	
	/**
	 * Nombre: getAll
	 * Entradas: -
	 * Salidas: Una lista con todas las reservas
	 * Descripcion: dada una solicitud get hecha en booking/getAll
	 * 				se retonar la lista de todas las reservas en el sistema
	 */
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	Collection<Reserva> getAll(){
		return reservaRepository.findAll();
	}
	
	/**
	 * Nombre: add
	 * Entradas: La entidad reserva la cual sera agregada al sistema
	 * Salidas: La reserva creada con todas los atributos
	 * Descripcion: dada la solicitud de tipo de POST, el servidor recibe
	 * 				la informacion de la reserva en tipo JSON y lo agrega
	 * 				al sistema
	 */
	@RequestMapping(value="/add", method=RequestMethod.POST)
	Reserva add(@RequestBody Reserva input){
		return reservaRepository.save(input);
	}
	
	/**
	 * Nombre : update
	 * Entradas: La tupla de la entidad que sera actualizada
	 * Salidas: la tupla actualizada
	 * Descripción: actualiza la tupla que llega en la base de datos.
	 */
	@RequestMapping(value = "/update", method=RequestMethod.POST)
	Reserva update(@RequestBody Reserva reserva){
		return reservaRepository.save(reserva);
	}
	
	/**
	 * Nombre: findByEstablishment
	 * Entradas: El id del establecimiento 
	 * Salidas: Una lista con todas las reservas dado un establecimiento
	 * Descripcion: Dado el id de un establecimiento como entrada este se encarga de buscar en la
	 * 				base de datos dicha o dichas reservas
	 */
	@RequestMapping(value = "/getByIdEstablecimiento/{id}",method = RequestMethod.GET)
	Collection<Reserva> findByEstablishment(@PathVariable Long id){
		return reservaRepository.findByEstablecimiento(id);
	}
	
	/**
	 * Nombre: findByUser
	 * Entradas: El id del usuario 
	 * Salidas: Una lista con todas las reservas dado un usuario
	 * Descripcion: Dado el id de un usuario como entrada este se encarga de buscar en la
	 * 				base de datos dicha o dichas reservas
	 */
	@RequestMapping(value = "/getByIdUsuario/{id}",method = RequestMethod.GET)
	Collection<Reserva> findByUsuario(@PathVariable Long id){
		return reservaRepository.findByUsuario(id);
	}
}

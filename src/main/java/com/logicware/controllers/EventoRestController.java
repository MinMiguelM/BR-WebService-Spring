package com.logicware.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.logicware.entities.Evento;
import com.logicware.entities.Usuario;
import com.logicware.repositories.EventoRepository;

/**
 * Encargado de recibir los mensajes del cliente. Estos mensajes
 * estan relacionados con la entidad Evento
 */
@RestController
@RequestMapping("/event")
public class EventoRestController {
	
	@Autowired private EventoRepository eventoRepository;
	
	/**
	 * Nombre: add
	 * Entradas: La entidad evento la cual sera agregada al sistema
	 * Salidas: El evento creado con todas los atributos
	 * Descripcion: dada la solicitud de tipo de POST, el servidor recibe
	 * 				la informacion del evento en tipo JSON y lo agrega
	 * 				al sistema
	 */
	@RequestMapping(value="/add", method=RequestMethod.POST)
	Evento add(@RequestBody Evento input){
		return eventoRepository.save(input);
	}
	
	/**
	 * Nombre: getAll
	 * Entradas: -
	 * Salidas: Una lista con todo los eventos
	 * Descripcion: dada una solicitud get hecha en event/getAll
	 * 				se retonar la lista de todos los eventos en el sistema
	 */
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	Collection<Evento> getAll(){
		return eventoRepository.findAll();
	}
}

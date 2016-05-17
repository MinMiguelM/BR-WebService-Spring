package com.logicware.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.logicware.entities.ComentarioYCalificacion;
import com.logicware.entities.Usuario;
import com.logicware.repositories.ComentarioYCalificacionRepository;

/**
 * Encargado de recibir los mensajes del cliente. Estos mensajes
 * estan relacionados con la entidad ComentarioYCalificacion
 */
@RestController
@RequestMapping("/comments")
public class ComentarioYCalificacionRestController {

	@Autowired ComentarioYCalificacionRepository comentarioYCalificacionRepository;
	
	/**
	 * Nombre: add
	 * Entradas: la entidad que sera agregada a la base de datos
	 * Salidas: El comentario y la calificacion que se genero en 
	 * 			la base de datos
	 * Descripcion: segun la entidad que llegue, este se guarda en la base de datos
	 */
	@RequestMapping(value="/add", method=RequestMethod.POST)
	ComentarioYCalificacion add(@RequestBody ComentarioYCalificacion input){
		return comentarioYCalificacionRepository.save(input);
	}
	
	/**
	 * Nombre: getAll
	 * Entradas: -
	 * Salidas: Una lista con todo los comentarios y calificaciones
	 * Descripcion: dada una solicitud get hecha en comments/getAll
	 * 				se retonar la lista de todos los comentarios y calificaciones en el sistema
	 */
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	Collection<ComentarioYCalificacion> getAll(){
		return comentarioYCalificacionRepository.findAll();
	}
}

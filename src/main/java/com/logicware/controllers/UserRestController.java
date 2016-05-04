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
 * Encargado de recibir los mensajes del cliente. Estos mensajes
 * estan relacionados con la entidad usuario
 */
@RestController
@RequestMapping("/user")
public class UserRestController {
	
	@Autowired private UserRepository userRepository;
	
	/**
	 * Nombre: getAll
	 * Entradas: -
	 * Salidas: Una lista con todo los usuarios
	 * Descripcion: dada una solicitud get hecha en user/getAll
	 * 				se retonar la lista de todos los usuarios en el sistema
	 */
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	Collection<User> getAll(){
		return userRepository.findAll();
	}
	
	/**
	 * Nombre: add
	 * Entradas: La entidad usuario la cual sera agregada al sistema
	 * Salidas: El usuario creado con todas los atributos
	 * Descripcion: dada la solicitud de tipo de POST, el servidor recibe
	 * 				la informacion del usuario en tipo JSON y lo agrega
	 * 				al sistema
	 */
	@RequestMapping(value="/add", method=RequestMethod.POST)
	User add(@RequestBody User input){
		return userRepository.save(input);
	}
	
	/**
	 * Nombre: getByCorreo
	 * Entradas: el correo del usuario a buscar
	 * Salidas: una instancia del usuario con dicho correo, si no existe retorna null
	 * Descripcion: Dado un correo como entrada este se encarga de buscar en la
	 * 				base de datos dicho usuario
	 */
	@RequestMapping(value="/getByCorreo/\"{correo}\"", method=RequestMethod.GET)
	User getByCorreo(@PathVariable String correo){
		return userRepository.findByCorreo(correo);
	}
	
	/**
	 * Nombre: getByToken
	 * Entradas: el token del usuario a buscar
	 * Salidas: una instancia del usuario con dicho token, si no existe retorna null
	 * Descripcion: Dado un correo como entrada este se encarga de buscar en la
	 * 				base de datos dicho usuario
	 */
	@RequestMapping(value="/getByToken/{token}", method=RequestMethod.GET)
	User getByToken(@PathVariable String token){
		return userRepository.findByToken(token);
	}

}

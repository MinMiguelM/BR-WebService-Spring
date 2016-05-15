package com.logicware.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.logicware.entities.Producto;
import com.logicware.entities.Usuario;
import com.logicware.repositories.ProductoRepository;

/**
 * Encargado de recibir los mensajes del cliente. Estos mensajes
 * estan relacionados con la entidad Producto
 */
@RestController
@RequestMapping("/item")
public class ProductoRestController {
	
	@Autowired ProductoRepository productoRepository;
	
	/**
	 * Nombre: add
	 * Entradas: La entidad producto la cual sera agregada al sistema
	 * Salidas: El producto creado con todas los atributos
	 * Descripcion: dada la solicitud de tipo de POST, el servidor recibe
	 * 				la informacion del producto en tipo JSON y lo agrega
	 * 				al sistema
	 */
	@RequestMapping(value="/add", method=RequestMethod.POST)
	Producto add(@RequestBody Producto input){
		return productoRepository.save(input);
	}
	
	/**
	 * Nombre: getAll
	 * Entradas: -
	 * Salidas: Una lista con todo los productos
	 * Descripcion: dada una solicitud get hecha en item/getAll
	 * 				se retonar la lista de todos los productos en el sistema
	 */
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	Collection<Producto> getAll(){
		return productoRepository.findAll();
	}
}

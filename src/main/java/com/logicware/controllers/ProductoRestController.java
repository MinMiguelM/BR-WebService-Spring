package com.logicware.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logicware.repositories.ProductoRepository;

/**
 * Encargado de recibir los mensajes del cliente. Estos mensajes
 * estan relacionados con la entidad Producto
 */
@RestController
@RequestMapping("/item")
public class ProductoRestController {
	
	@Autowired ProductoRepository productoRepository;

}

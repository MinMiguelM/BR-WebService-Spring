package com.logicware.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logicware.repositories.ReservaRepository;

/**
 * Encargado de recibir los mensajes del cliente. Estos mensajes
 * estan relacionados con la entidad Reserva
 */
@RestController
@RequestMapping("/booking")
public class ReservaRestController {
	
	@Autowired private ReservaRepository reservaRepository;

}

/**
 * 
 */
package com.logicware.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logicware.repositories.ReservaRepository;

/**
 * @author Pablo Gaitan
 *
 */
@RestController
@RequestMapping("/reserva")
public class ReservaRestController {
	@Autowired private ReservaRepository reservaRepository;

}

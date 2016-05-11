/**
 * 
 */
package com.logicware.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logicware.repositories.EventoRepository;

/**
 * @author Pablo Gaitan
 *
 */
@RestController
@RequestMapping("/evento")
public class EventoRestController {
	@Autowired private EventoRepository eventoRepository;
}

package com.logicware.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logicware.entities.Evento;
import com.logicware.entities.Reserva;

/**
 * Este repositorio se encarga de guardar las consultas que se
 * pueden aplicar sobre la entidad Reserva
 */
public interface ReservaRepository extends JpaRepository<Reserva, Long> {

	Collection<Reserva> findByEstablecimiento(Long id);
	
	Collection<Reserva> findByUsuario(Long id);
}

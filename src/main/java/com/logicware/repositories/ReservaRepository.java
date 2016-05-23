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
	
	/**
	 * Nombre: findByEstablecimiento
	 * Entradas: el id del establecimiento de la cual se desea la lista
	 * Salidas: Una lista con todos las reservas al establecimiento
	 * Descripción: Busque y trae todas las reservas de un establecimiento específico
	 */
	Collection<Reserva> findByEstablecimiento(Long id);
	
	/**
	 * Nombre: findByUsuario
	 * Entradas: el id del usuario de la cual se desea la lista
	 * Salidas: Una lista con todas las reservas del usuario
	 * Descripción: Busque y trae todas las reservas de un usuario específico
	 */

	Collection<Reserva> findByUsuario(Long id);
}

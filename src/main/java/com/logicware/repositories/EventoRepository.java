package com.logicware.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logicware.entities.Establecimiento;
import com.logicware.entities.Evento;

/**
 * Este repositorio se encarga de guardar las consultas que se
 * pueden aplicar sobre la entidad Evento
 */
public interface EventoRepository extends JpaRepository<Evento, Long>{
	
	/**
	 * Nombre: findByEstablecimiento
	 * Entradas: el id del establecimiento de la cual se desea la lista
	 * Salidas: Una lista con todos los eventos del establecimiento
	 * Descripción: Busque y trae todos los eventos de un establecimiento específico
	 */
	Collection<Evento> findByEstablecimiento(Long id);
	
	/**
	 * Nombre: findByUsuario
	 * Entradas: el id del usuario de la cual se desea la lista
	 * Salidas: Una lista con todos los eventos del usuario
	 * Descripción: Busque y trae todos los eventos de un usuario específico
	 */
	Collection<Evento> findByUsuario(Long id);
}

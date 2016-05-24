package com.logicware.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logicware.entities.ComentarioYCalificacion;

/**
 * Este repositorio se encarga de guardar las consultas que se
 * pueden aplicar sobre la entidad ComentariYCalificacion
 */
public interface ComentarioYCalificacionRepository extends JpaRepository<ComentarioYCalificacion, Long>{
	
	/**
	 * Nombre: findByEstablecimiento
	 * Entradas: id del establecimiento
	 * Salidas: Lista de comentarios del establecimiento con un id
	 * Descripción: Trae de la base de datos una lista de comentarios
	 * 				que le han hecho a un establecimiento en particular
	 */
	Collection<ComentarioYCalificacion> findByEstablecimiento(Long id);

}

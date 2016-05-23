package com.logicware.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logicware.entities.ComentarioYCalificacion;

/**
 * Este repositorio se encarga de guardar las consultas que se
 * pueden aplicar sobre la entidad ComentariYCalificacion
 */
public interface ComentarioYCalificacionRepository extends JpaRepository<ComentarioYCalificacion, Long>{
	
	Collection<ComentarioYCalificacion> findByEstablecimiento(Long id);

}

package com.logicware.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logicware.entities.Establecimiento;
import com.logicware.entities.Usuario;

/**
 * Este repositorio se encarga de guardar las consultas que se
 * pueden aplicar sobre la entidad Establecimiento
 */
public interface EstablecimientoRepository extends JpaRepository<Establecimiento, Long>{
	
	/**
	 * Nombre: findAllByUser
	 * Entradas: el usuario propietario de los establecimientos
	 * Salidas: las instancias del establecimiento encontradas, o coleccion vacia si no lo
	 * 			encontro
	 * Descripcion: Encuentra los establecimientos por un usuario dado
	 * 				
	 */
	Collection<Establecimiento> findAllByUsuario(Long idUsuario);
	
	/**
	 * Nombre: findByName
	 * Entradas: el nombre del establecimiento a buscar
	 * Salidas: las instancias del establecimiento encontradas, o coleccion vacia si no lo
	 * 			encontro
	 * Descripcion: Encuentra los establecimientos por un nombre o parte de el dada
	 * 				
	 */
	Collection<Establecimiento> findByNombre(String nombre);
	
	/**
	 * Nombre: findByTipo
	 * Entradas: el tipo de establecimiento de la cual se desea la lista
	 * Salidas: Una lista con todos los establecimientos de tipo bar o restaurante
	 * Descripción: Busque y trae todos los establecimientos de un tipo específico
	 */
	Collection<Establecimiento> findByTipo(String tipo);
}

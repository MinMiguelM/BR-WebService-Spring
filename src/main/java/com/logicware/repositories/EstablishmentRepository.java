/**
 * 
 */
package com.logicware.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logicware.entities.Establishment;
import com.logicware.entities.User;

/**
 * @author miguel
 *
 */
public interface EstablishmentRepository extends JpaRepository<Establishment, Long>{
	
	/**
	 * Nombre: findAllByUser
	 * Entradas: el usuario propietario de los establecimientos
	 * Salidas: las instancias del establecimiento encontradas, o coleccion vacia si no lo
	 * 			encontro
	 * Descripcion: Encuentra los establecimientos por un usuario dado
	 * 				
	 */
	Collection<Establishment> findAllByUser(User user);
	
	/**
	 * Nombre: findByName
	 * Entradas: el nombre del establecimiento a buscar
	 * Salidas: las instancias del establecimiento encontradas, o coleccion vacia si no lo
	 * 			encontro
	 * Descripcion: Encuentra los establecimientos por un nombre o parte de el dada
	 * 				
	 */
	Collection<Establishment> findByNombre(String name);
}

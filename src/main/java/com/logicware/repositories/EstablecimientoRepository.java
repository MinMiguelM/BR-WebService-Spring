/**
 * 
 */
package com.logicware.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logicware.entities.Establecimiento;
import com.logicware.entities.Usuario;

/**
 * @author miguel
 *
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
	Collection<Establecimiento> findAllByUsuario(Usuario usuario);
	
	/**
	 * Nombre: findByName
	 * Entradas: el nombre del establecimiento a buscar
	 * Salidas: las instancias del establecimiento encontradas, o coleccion vacia si no lo
	 * 			encontro
	 * Descripcion: Encuentra los establecimientos por un nombre o parte de el dada
	 * 				
	 */
	Collection<Establecimiento> findByNombre(String nombre);
}

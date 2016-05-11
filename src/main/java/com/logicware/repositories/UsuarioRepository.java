package com.logicware.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.logicware.entities.Usuario;

/**
 * @author ASUS
 * Este repositorio se encarga de guardar las consultas que se
 * pueden aplicar sobre la entidad User
 */
//@RepositoryRestResource
public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
	
	/**
	 * Nombre: findyByCorreo
	 * Entradas: el correo del usuario a buscar
	 * Salidas: la instancia del usuario encontrado, o null si no lo
	 * 			encontro
	 * Descripcion: Encuentra un usuario dado el correo con el que
	 * 				se registro
	 */
	Usuario findByCorreo(String correo);
	
	/**
	 * Nombre: findByToken
	 * Entradas: el token del usuario a buscar
	 * Salidas: la instancia del usuario encontrado, o null si no lo
	 * 			encontro
	 * Descripcion: Encuentra un usuario dado el token que se genero en
	 * 				el momento que se registro.
	 */
	Usuario findByToken(String token);
}

/**
 * 
 */
package com.logicware.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.logicware.entities.User;

/**
 * @author ASUS
 * Este repositorio se encarga de guardar las consultas que se
 * pueden aplicar sobre la entidad User
 */
//@RepositoryRestResource
public interface UserRepository extends JpaRepository<User,Long>{
	
	/**
	 * Nombre: findyByCorreo
	 * Entradas: el correo del usuario a buscar
	 * Salidas: la instancia del usuario encontrado, o null si no lo
	 * 			encontro
	 * Descripcion: Encuentra un usuario dado el correo con el que
	 * 				se registro
	 */
	User findByCorreo(String correo);
	
	/**
	 * Nombre: findByToken
	 * Entradas: el token del usuario a buscar
	 * Salidas: la instancia del usuario encontrado, o null si no lo
	 * 			encontro
	 * Descripcion: Encuentra un usuario dado el token que se genero en
	 * 				el momento que se registro.
	 */
	User findByToken(String token);
	
	/**
	 * Nombre: updateToken
	 * Entradas: el nuevo token a ser actualizado, y el correo del usuario
	 * 			 a quien se le sera actualizado el token
	 * Salidas: El usuario con la actualizacion realizada
	 * Descripcion: Dado un correo actualiza el token de dicho usuario
	 */
	//User updateToken(String newToken, String correo);
}

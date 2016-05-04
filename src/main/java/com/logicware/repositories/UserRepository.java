/**
 * 
 */
package com.logicware.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.logicware.entities.User;

/**
 * @author ASUS
 *
 */
//@RepositoryRestResource
public interface UserRepository extends JpaRepository<User,Long>{
	
	User findByCorreo(String correo);
	User findByToken(String token);
}

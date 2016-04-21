/**
 * 
 */
package com.logicware.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logicware.entities.User;

/**
 * @author ASUS
 *
 */
public interface UserRepository extends JpaRepository<User,Long>{
	
	User findByCorreo(String correo);
}

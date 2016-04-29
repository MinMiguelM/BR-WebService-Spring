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

	Collection<Establishment> findAllByUser(User user);
}

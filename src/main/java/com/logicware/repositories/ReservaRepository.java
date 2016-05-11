/**
 * 
 */
package com.logicware.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logicware.entities.Reserva;

/**
 * @author Pablo Gaitan
 *
 */
public interface ReservaRepository extends JpaRepository<Reserva, Long> {

}

/**
 * 
 */
package com.logicware.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logicware.entities.Establecimiento;
import com.logicware.entities.Evento;

/**
 * @author Pablo Gaitan
 *
 */
public interface EventoRepository extends JpaRepository<Evento, Long>{

}

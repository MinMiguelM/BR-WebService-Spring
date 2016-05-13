package com.logicware.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logicware.entities.Establecimiento;
import com.logicware.entities.Evento;

/**
 *
 */
public interface EventoRepository extends JpaRepository<Evento, Long>{

}

package com.logicware.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logicware.entities.Establecimiento;
import com.logicware.entities.Evento;

/**
 * Este repositorio se encarga de guardar las consultas que se
 * pueden aplicar sobre la entidad Evento
 */
public interface EventoRepository extends JpaRepository<Evento, Long>{

}

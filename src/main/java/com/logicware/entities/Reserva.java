package com.logicware.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * Entidad que representa la reserva que un usuario hace
 * a un establecimiento
 */
@NamedQueries({
	@NamedQuery(name = "Reserva.findByEstablecimiento",query = "select r from Reserva r where r.establecimiento.idEstablecimiento = ?"),
	@NamedQuery(name = "Reserva.findByUsuario",query = "select r from Reserva r where r.usuario.idUsuario = ?")
})

@Entity
public class Reserva implements Serializable{

	@Id
	@GeneratedValue
	private long idReserva;
	private String fecha_reserva;
	private String estado;
	private long cantidad_personas;
	
	@JoinColumn(name = "IDUSUARIO",referencedColumnName = "IDUSUARIO")
	@ManyToOne
	private Usuario usuario;
	
	@JoinColumn(name = "IDESTABLECIMIENTO",referencedColumnName = "IDESTABLECIMIENTO")
	@ManyToOne
	private Establecimiento establecimiento;
	
	/**
	 * @return the idReserva
	 */
	public long getIdReserva() {
		return idReserva;
	}
	
	/**
	 * @param idReserva the idReserva to set
	 */
	public void setIdReserva(long idReserva) {
		this.idReserva = idReserva;
	}
	
	/**
	 * @return the fecha_reserva
	 */
	public String getFecha_reserva() {
		return fecha_reserva;
	}
	
	/**
	 * @param fecha_reserva the fecha_reserva to set
	 */
	public void setFecha_reserva(String fecha_reserva) {
		this.fecha_reserva = fecha_reserva;
	}
	
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}
	
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	/**
	 * @return the cantidad_personas
	 */
	public long getCantidad_personas() {
		return cantidad_personas;
	}
	
	/**
	 * @param cantidad_personas the cantidad_personas to set
	 */
	public void setCantidad_personas(long cantidad_personas) {
		this.cantidad_personas = cantidad_personas;
	}
	
	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}
	
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	/**
	 * @return the establecimiento
	 */
	public Establecimiento getEstablecimiento() {
		return establecimiento;
	}
	
	/**
	 * @param establecimiento the establecimiento to set
	 */
	public void setEstablecimiento(Establecimiento establecimiento) {
		this.establecimiento = establecimiento;
	}
}

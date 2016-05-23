package com.logicware.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;


/**
 * Entidad que representa el evento creado por un usuario
 * o por un establecimiento.
 */

@NamedQueries({
	@NamedQuery(name = "Evento.findByEstablecimiento",query = "select e from Evento e where e.establecimiento.idEstablecimiento = ?"),
	@NamedQuery(name = "Evento.findByUsuario",query = "select e from Evento e where e.usuario.idUsuario = ?")
})
@Entity
public class Evento implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name = "IDEVENTO")
	private Long idEvento;
	private String fecha_inicio;
	private String fecha_fin;
	private String descripcion;
	private String titulo;
	
	@JoinColumn(name = "IDUSUARIO",referencedColumnName = "IDUSUARIO")
	@ManyToOne
	private Usuario usuario;
	
	@JoinColumn(name = "IDESTABLECIMIENTO",referencedColumnName = "IDESTABLECIMIENTO")
	@ManyToOne
	private Establecimiento establecimiento;
	
	/**
	 * @return the idEvento
	 */
	public Long getIdEvento() {
		return idEvento;
	}
	
	/**
	 * @param idEvento the idEvento to set
	 */
	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}
	
	/**
	 * @return the fecha_inicio
	 */
	public String getFecha_inicio() {
		return fecha_inicio;
	}
	/**
	 * @param fecha_inicio the fecha_inicio to set
	 */
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	/**
	 * @return the fecha_fin
	 */
	public String getFecha_fin() {
		return fecha_fin;
	}
	/**
	 * @param fecha_fin the fecha_fin to set
	 */
	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	 * @return the usuario
	 */
	/*public Usuario getUsuario() {
		return usuario;
	}*/
	
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the establecimiento
	 */
	/*public Establecimiento getEstablecimiento() {
		return establecimiento;
	}*/

	/**
	 * @param establecimiento the establecimiento to set
	 */
	public void setEstablecimiento(Establecimiento establecimiento) {
		this.establecimiento = establecimiento;
	}
}

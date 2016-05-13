package com.logicware.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * La entidad que une los comentarios y la calificación, 
 * para cada uno de los establecimientos. Estos pueden
 * ser hechas por los usuarios.
 */
@Entity
public class ComentarioYCalificacion implements Serializable{
	
	@Id
	@GeneratedValue
	private Long idComentarioYCalificacion;
	
	private String descripcion;
	private Integer calificacion;
	
	@JoinColumn(name = "IDUSUARIO",referencedColumnName = "IDUSUARIO")
	@ManyToOne
	private Usuario usuario;
	
	@JoinColumn(name = "IDESTABLECIMIENTO",referencedColumnName = "IDESTABLECIMIENTO")
	@ManyToOne
	private Establecimiento establecimiento;

	/**
	 * @return the idComentarioYCalificacion
	 */
	public Long getIdComentarioYCalificacion() {
		return idComentarioYCalificacion;
	}

	/**
	 * @param idComentarioYCalificacion the idComentarioYCalificacion to set
	 */
	public void setIdComentarioYCalificacion(Long idComentarioYCalificacion) {
		this.idComentarioYCalificacion = idComentarioYCalificacion;
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
	 * @return the calificacion
	 */
	public Integer getCalificacion() {
		return calificacion;
	}

	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
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

/**
 * 
 */
package com.logicware.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * Entidad que representara un establecimiento.
 */
@Entity
@NamedQueries({
	@NamedQuery(name = "Establishment.findByNombre",query= "select e.nombre AS nombre,e.ubicacion AS ubicacion,e.calificacionPromedio AS calificacionPromedio  from Establishment e where e.nombre like ?")
})
public class Establishment implements Serializable{
	
	@Id
	@GeneratedValue
	private Long idEstablishment;
	
	@Id
	@Column(nullable = false, insertable = false, updatable = false)
	private Long idUser;
	
	@JoinColumn(name="ID")
	@ManyToOne
	private User user;
	
	private String nombre;
	private String ubicacion;
	private double calificacionPromedio;
	private String tematica;
	private String descripcion;
	private String horario;
	
	/**
	 * @param nombre
	 * @param ubicacion
	 * @param calificacionPromedio
	 * @param tematica
	 * @param descripcion
	 * @param horario
	 */
	/*public Establishment(String nombre, String ubicacion, double calificacionPromedio, String tematica,
			String descripcion, String horario) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.calificacionPromedio = calificacionPromedio;
		this.tematica = tematica;
		this.descripcion = descripcion;
		this.horario = horario;
	}*/

	/**
	 * @param user
	 * @param nombre
	 * @param ubicacion
	 * @param calificacionPromedio
	 * @param tematica
	 * @param descripcion
	 * @param horario
	 */
	/*public Establishment(User user, String nombre, String ubicacion, double calificacionPromedio, String tematica,
			String descripcion, String horario) {
		super();
		this.user = user;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.calificacionPromedio = calificacionPromedio;
		this.tematica = tematica;
		this.descripcion = descripcion;
		this.horario = horario;
	}*/

	/**
	 * @return the id
	 */
	public Long getIdEstablishment() {
		return idEstablishment;
	}

	/**
	 * @return the idUser
	 */
	public Long getIdUser() {
		return idUser;
	}

	
	/**
	 * @param idUser to set.
	 */
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	/**
	 * @param id the id to set
	 */
	public void setIdEstablishment(Long id) {
		this.idEstablishment = id;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the ubicacion
	 */
	public String getUbicacion() {
		return ubicacion;
	}

	/**
	 * @param ubicacion the ubicacion to set
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	/**
	 * @return the calificacionPromedio
	 */
	public double getCalificacionPromedio() {
		return calificacionPromedio;
	}

	/**
	 * @param calificacionPromedio the calificacionPromedio to set
	 */
	public void setCalificacionPromedio(double calificacionPromedio) {
		this.calificacionPromedio = calificacionPromedio;
	}

	/**
	 * @return the tematica
	 */
	public String getTematica() {
		return tematica;
	}

	/**
	 * @param tematica the tematica to set
	 */
	public void setTematica(String tematica) {
		this.tematica = tematica;
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
	 * @return the horario
	 */
	public String getHorario() {
		return horario;
	}

	/**
	 * @param horario the horario to set
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}
}

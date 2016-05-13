package com.logicware.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * La entidad que representa los productos que puede ofrecer
 * un establecimiento, para que de antemano el usuario
 * sepa que ofrece dicho establecimiento
 */
@Entity
public class Producto implements Serializable{
	
	@Id
	@GeneratedValue
	private Long idProducto;
	
	private String nombre;
	private double precio;
	private String descripcion;
	
	@JoinColumn(name = "IDESTABLECIMIENTO",referencedColumnName = "IDESTABLECIMIENTO")
	@ManyToOne
	private Establecimiento establecimiento;

	/**
	 * @return the idProducto
	 */
	public Long getIdProducto() {
		return idProducto;
	}

	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
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
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
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

package com.logicware.entities;

import java.io.Serializable;
import java.util.Collection;

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

/**
 * Entidad que representara un establecimiento.
 */
@Entity
@NamedQueries({
	@NamedQuery(name = "Establecimiento.findByNombre",query= "select e from Establecimiento e where e.nombre like ?"),
	@NamedQuery(name = "Establecimiento.findByTipo", query= "select e from Establecimiento e where e.tipo = ?"),
	@NamedQuery(name = "Establecimiento.findAllByUsuario", query = "select e from Establecimiento e where e.usuario.idUsuario = ?")
})
public class Establecimiento implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name = "IDESTABLECIMIENTO")
	private Long idEstablecimiento;
	
	private String nombre;
	private String direccion;
	private String horario;
	private String tematica;
	private String tipo;
	@Lob
	private byte[] imagen;
	private String telefono;
	private double calificacion_promedio;
	
	@JoinColumn(name="IDUSUARIO",referencedColumnName="IDUSUARIO")
	@ManyToOne
	private Usuario usuario;
	
	@OneToMany(mappedBy = "establecimiento")
	private Collection<Evento> eventos;
	
	@OneToMany(mappedBy = "establecimiento")
	private Collection<Reserva> reservas;
	
	@OneToMany(mappedBy = "establecimiento")
	private Collection<Producto> productos;
	
	@OneToMany(mappedBy = "establecimiento")
	private Collection<ComentarioYCalificacion> comentariosYCalificaciones;
	
	/**
	 * @return the id
	 */
	public Long getIdEstablecimiento() {
		return idEstablecimiento;
	}

	/**
	 * @param id the id to set
	 */
	public void setIdEstablecimiento(Long idEstablecimiento) {
		this.idEstablecimiento = idEstablecimiento;
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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the imagen
	 */
	public byte[] getImagen() {
		return imagen;
	}

	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the calificacion_promedio
	 */
	public double getCalificacion_promedio() {
		return calificacion_promedio;
	}

	/**
	 * @param calificacion_promedio the calificacion_promedio to set
	 */
	public void setCalificacion_promedio(double calificacion_promedio) {
		this.calificacion_promedio = calificacion_promedio;
	}

	/**
	 * @param user the user to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the eventos
	 */
	/*public Collection<Evento> getEventos() {
		return eventos;
	}*/

	/**
	 * @param eventos the eventos to set
	 */
	public void setEventos(Collection<Evento> eventos) {
		this.eventos = eventos;
	}

	/**
	 * @return the reservas
	 */
	/*public Collection<Reserva> getReservas() {
		return reservas;
	}*/

	/**
	 * @param reservas the reservas to set
	 */
	public void setReservas(Collection<Reserva> reservas) {
		this.reservas = reservas;
	}

	/**
	 * @return the productos
	 */
	public Collection<Producto> getProductos() {
		return productos;
	}

	/**
	 * @param productos the productos to set
	 */
	public void setProductos(Collection<Producto> productos) {
		this.productos = productos;
	}

	/**
	 * @return the comentariosYCalificaciones
	 */
	/*public Collection<ComentarioYCalificacion> getComentariosYCalificaciones() {
		return comentariosYCalificaciones;
	}*/

	/**
	 * @param comentariosYCalificaciones the comentariosYCalificaciones to set
	 */
	public void setComentariosYCalificaciones(Collection<ComentarioYCalificacion> comentariosYCalificaciones) {
		this.comentariosYCalificaciones = comentariosYCalificaciones;
	}	
}

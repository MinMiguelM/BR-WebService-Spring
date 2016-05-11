package com.logicware.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.logicware.entities.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

/**
 * @author ASUS
 * Entidad usuario que es representada por varios atributos
 */
@Entity
@NamedQueries({
	@NamedQuery(name = "User.findByToken",query = "select u from Usuario u where u.token = ?"),
	@NamedQuery(name = "User.findByCorreo",query = "select u from Usuario u where u.correo = ?")
})
public class Usuario implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name = "IDUSUARIO")
	private Long idUsuario;
	private String nombre;
	@Column(unique = true)
	private String correo;
	private String telefono;
	@Column(unique = true)
	private String token;
	private boolean link_facebook;
	private String contrasena;
	private String tipo;
	@Lob
	private byte[] imagen;
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Collection<Establecimiento> establecimientos;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Collection<Evento> eventos;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Collection<Reserva> reservas;
	
	/**
	 * @return the id
	 */
	public Long getIdUsuario() {
		return idUsuario;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
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
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}
	
	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
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
	 * @return the token
	 */
	public String getToken() {
		return token;
	}
	
	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}
	
	/**
	 * @return the link_facebook
	 */
	public boolean isLink_facebook() {
		return link_facebook;
	}
	
	/**
	 * @param link_facebook the link_facebook to set
	 */
	public void setLink_facebook(boolean link_facebook) {
		this.link_facebook = link_facebook;
	}
	
	/**
	 * @return the contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}
	
	/**
	 * @param contrasena the contrasena to set
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
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
	 * @return
	 */
	public Collection<Establecimiento> getEstablecimientos(){
		return this.establecimientos;
	}
	
	/**
	 * @param establecimientos the establecimientos to set
	 */
	public void setEstablecimientos(Collection<Establecimiento> establecimientos) {
		this.establecimientos = establecimientos;
	}
}
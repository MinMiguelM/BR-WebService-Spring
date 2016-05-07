/**
 * 
 */
package com.logicware.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	@NamedQuery(name = "User.findByToken",query = "select u from User u where u.token = ?"),
	@NamedQuery(name = "User.findByCorreo",query = "select u from User u where u.correo = ?")
})
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany(mappedBy="user")
	private Collection<Establishment> establishment = new ArrayList(); 
	@Column(unique = true)
	private String correo;
	private String nombre;
	private String password;
	private String num_cel;
	private String rol;
	private String link_facebook;
	@Column(unique = true)
	private String token;
	
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param correo
	 * @param nombre
	 * @param password
	 * @param num_cel
	 * @param rol
	 * @param link_facebook
	 * @param token_facebook
	 */
	public User(String correo, String nombre, String password, String num_cel, String rol, String link_facebook,
			String token) {
		super();
		this.correo = correo;
		this.nombre = nombre;
		this.password = password;
		this.num_cel = num_cel;
		this.rol = rol;
		this.link_facebook = link_facebook;
		this.token = token;
	}

	/**
	 * @return the establishment
	 */
	public Collection<Establishment> getEstablishment() {
		return establishment;
	}

	/**
	 * @param establishment the establishment to set
	 */
	public void setEstablishment(Collection<Establishment> establishment) {
		this.establishment = establishment;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the num_cel
	 */
	public String getNum_cel() {
		return num_cel;
	}

	/**
	 * @param num_cel the num_cel to set
	 */
	public void setNum_cel(String num_cel) {
		this.num_cel = num_cel;
	}

	/**
	 * @return the rol
	 */
	public String getRol() {
		return rol;
	}

	/**
	 * @param rol the rol to set
	 */
	public void setRol(String rol) {
		this.rol = rol;
	}

	/**
	 * @return the link_facebook
	 */
	public String getLink_facebook() {
		return link_facebook;
	}

	/**
	 * @param link_facebook the link_facebook to set
	 */
	public void setLink_facebook(String link_facebook) {
		this.link_facebook = link_facebook;
	}

	/**
	 * @return the token_facebook
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token_facebook the token_facebook to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

}

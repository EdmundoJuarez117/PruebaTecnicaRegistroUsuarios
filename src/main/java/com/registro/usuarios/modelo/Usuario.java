package com.registro.usuarios.modelo;


import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "usuarios", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario {
	@Id
	@Column(name = "LOGIN")
	private String username;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "CLIENTE")
	private float cliente;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "FECHAALTA")
	private Date fechaAlta;

	@Column(name = "FECHABAJA")
	private Date fechaBaja;

	@Column(name = "STATUS")
	private char status;

	@Column(name = "INTENTOS")
	private float intentos;

	@Column(name = "FECHAREVOCADO")
	private Date fechaRevocado;

	@Column(name = "FECHA_VIGENCIA")
	private Date fechaVigencia;

	@Column(name = "NO_ACCESO")
	private int noAcceso;

	@Column(name = "APELLIDO_PATERNO")
	private String apellidoPaterno;

	@Column(name = "APELLIDO_MATERNO")
	private String apellidoMaterno;

	@Column(name = "AREA")
	private int area;

	@Column(name = "FECHAMODIFICACION")
	private Date fechaModificacion;

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
	 * 
	 * @Column(name = "nombre") private String nombre;
	 * 
	 * @Column(name = "apellido") private String apellido;
	 * 
	 * private String email; private String password;
	 */

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "usuarios_roles", joinColumns = @JoinColumn(name = "usuario_login", referencedColumnName = "login"), inverseJoinColumns = @JoinColumn(name = "rol_id", referencedColumnName = "id"))
	private Collection<Rol> roles;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getCliente() {
		return cliente;
	}

	public void setCliente(float cliente) {
		this.cliente = cliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public float getIntentos() {
		return intentos;
	}

	public void setIntentos(float intentos) {
		this.intentos = intentos;
	}

	public Date getFechaRevocado() {
		return fechaRevocado;
	}

	public void setFechaRevocado(Date fechaRevocado) {
		this.fechaRevocado = fechaRevocado;
	}

	public Date getFechaVigencia() {
		return fechaVigencia;
	}

	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

	public int getNoAcceso() {
		return noAcceso;
	}

	public void setNoAcceso(int noAcceso) {
		this.noAcceso = noAcceso;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Collection<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Rol> roles) {
		this.roles = roles;
	}

	public Usuario(String username, String password, String nombre, float cliente, String email, Date fechaAlta,
			Date fechaBaja, char status, float intentos, Date fechaRevocado, Date fechaVigencia, int noAcceso,
			String apellidoPaterno, String apellidoMaterno, int area, Date fechaModificacion, Collection<Rol> roles) {
		super();
		this.username = username;
		this.password = password;
		this.nombre = nombre;
		this.cliente = cliente;
		this.email = email;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.status = status;
		this.intentos = intentos;
		this.fechaRevocado = fechaRevocado;
		this.fechaVigencia = fechaVigencia;
		this.noAcceso = noAcceso;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.area = area;
		this.fechaModificacion = fechaModificacion;
		this.roles = roles;
	}

	public Usuario(String password, String nombre, float cliente, String email, Date fechaAlta, Date fechaBaja,
			char status, float intentos, Date fechaRevocado, Date fechaVigencia, int noAcceso, String apellidoPaterno,
			String apellidoMaterno, int area, Date fechaModificacion, Collection<Rol> roles) {
		super();
		this.password = password;
		this.nombre = nombre;
		this.cliente = cliente;
		this.email = email;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.status = status;
		this.intentos = intentos;
		this.fechaRevocado = fechaRevocado;
		this.fechaVigencia = fechaVigencia;
		this.noAcceso = noAcceso;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.area = area;
		this.fechaModificacion = fechaModificacion;
		this.roles = roles;
	}

	public Usuario() {

	}

}

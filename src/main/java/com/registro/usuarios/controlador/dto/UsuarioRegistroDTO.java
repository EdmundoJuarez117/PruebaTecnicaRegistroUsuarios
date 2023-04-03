package com.registro.usuarios.controlador.dto;

import java.util.Date;

public class UsuarioRegistroDTO {

	private String username;

	
	private String password;

	
	private String nombre;

	
	private float cliente;

	
	private String email;

	
	private Date fechaAlta;

	
	private Date fechaBaja;

	
	private char status;

	
	private float intentos;

	
	private Date fechaRevocado;

	
	private Date fechaVigencia;

	
	private int noAcceso;

	
	private String apellidoPaterno;

	
	private String apellidoMaterno;

	
	private int area;

	
	private Date fechaModificacion;
	

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


	public UsuarioRegistroDTO(String password, String nombre, float cliente, String email, Date fechaAlta,
			Date fechaBaja, char status, float intentos, Date fechaRevocado, Date fechaVigencia, int noAcceso,
			String apellidoPaterno, String apellidoMaterno, int area, Date fechaModificacion) {
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
	}


	public UsuarioRegistroDTO() {

	}

}

package com.cibertec.entidad;

public class Cliente {
	private int codigoCliente; 
	private String nombres;
	private String apellidos; 
	private String direcci�n;
	private String tel�fono;
	private String dni;
	
	public Cliente() {
		
	}
	
	public Cliente(int codigoCliente, String nombres, String apellidos, String direcci�n, String tel�fono, String dni) {
		super();
		this.codigoCliente = codigoCliente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direcci�n = direcci�n;
		this.tel�fono = tel�fono;
		this.dni = dni;
	}







	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDirecci�n() {
		return direcci�n;
	}
	public void setDirecci�n(String direcci�n) {
		this.direcci�n = direcci�n;
	}
	public String getTel�fono() {
		return tel�fono;
	}
	public void setTel�fono(String tel�fono) {
		this.tel�fono = tel�fono;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	

}

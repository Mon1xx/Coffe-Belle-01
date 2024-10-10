package com.cibertec.entidad;

public class Usuario {
    private String nombreUsuario;
    private String contrase�a;

    public Usuario(String nombreUsuario, String contrase�a) {
        this.nombreUsuario = nombreUsuario;
        this.contrase�a = contrase�a;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrase�a() {
        return contrase�a;
    }

    public void setContrase�a(String contrase�a) {
        this.contrase�a = contrase�a;
    }

    public boolean validarCredenciales(String usuario, String contrase�a) {
        return this.nombreUsuario.equals(usuario) && this.contrase�a.equals(contrase�a);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl;

import java.util.Objects;


public class Usuario {
    
    private String correo;
    private String contrasenha;
    private String rol;
    private String nombre;
    private String apellido;
    private String avatar;
    private String nombreUsuario;
    
    //anhadir estos atributos
    private int puntos;

    

    public Usuario() {
    }

    public Usuario(String correo, String contrasenha, String rol, String nombre, String apellido, String avatar, String nombreUsuario) {
        this.correo = correo;
        this.contrasenha = contrasenha;
        this.rol = rol;
        this.nombre = nombre;
        this.apellido = apellido;
        this.avatar = avatar;
        this.nombreUsuario = nombreUsuario;
    }



    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public String getRol() {
        return rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "avatar=" + avatar + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        return true;
    }

    
    
    
}

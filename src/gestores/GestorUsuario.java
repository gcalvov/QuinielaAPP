/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import cl.Usuario;

/**
 *
 * @author Gabriel
 */
public class GestorUsuario extends Gestor {

    public boolean verificarUsuario(String correo) {
        return cl.verificarExistenciaUsuario(correo);
    }

    public void registrarUsuario(String correo, String contrasenha, String rol, String nombre, String apellido, String avatar, String nombreUsuario) {
        Usuario usuarioNuevo = new Usuario(correo, contrasenha, rol, nombre, apellido, avatar, nombreUsuario);
        cl.setUsuario(usuarioNuevo);
    }

    public boolean darAccesoUsuario(String correo, String pass) {
        return cl.darAccesoUsuario(correo, pass);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni.controller;

import java.sql.Connection;
import java.sql.SQLException;
import org.hibernate.SessionFactory;
import poo.muni.NivelEducativo;
import poo.muni.Perfil;
import poo.muni.Postulante;
import poo.muni.Programa;
import poo.muni.dao.UsuarioDao;
import poo.muni.ui.AltaUsuario;
import poo.muni.ui.LoginPanel;
import poo.muni.Usuario;
import poo.muni.dao.PostulanteDao;
import sun.util.calendar.BaseCalendar.Date;

/**
 *
 * @author Capacitacion5
 */
public class gestorDeEmpleo {

    private UsuarioDao usuarioDao;
    private PostulanteDao postulanteDao;

    public gestorDeEmpleo(SessionFactory sessionFactory, Connection connection) {
        // creamos las instancias de los objetos de acceso a datos
        this.usuarioDao = new UsuarioDao(sessionFactory, connection);
        this.postulanteDao = new PostulanteDao(sessionFactory, connection);
    }
    

    public void run() {
      new LoginPanel(this).setVisible(true);
    }

    public boolean GuardarUsuario(String nombreUsuario, String contraseña, String nombre, String apellido, String email) {
        Usuario usuario = new Usuario(nombreUsuario, contraseña, nombre, apellido, email);
        return usuarioDao.GuardarUsuario(usuario);

    }
    
    public boolean guardarPostulante (NivelEducativo nivelEducativo, Perfil perfil, String movilidad, String disponibilidadHoraria, String documentacionAdicional, Programa programa, String DNI, String sexo, String Edad, String nombre, String domicilio, String email, int cuit_cuil, int telefonoPrincipal, int telefonoAlternativo){
        Postulante postulante = new Postulante(nivelEducativo, perfil, movilidad, disponibilidadHoraria, documentacionAdicional, programa, DNI, sexo, Edad, nombre, domicilio, email, cuit_cuil, telefonoPrincipal, telefonoAlternativo);
        return postulanteDao.guardarPostulante(postulante);
    }

    public boolean isUserexist(String nombreUsuario) {
        return usuarioDao.ValidarUsuario(nombreUsuario);
    }
    
    public boolean isPasswordexist(String nombreUsuario, String contraseña){
        return usuarioDao.ValidarInicioDeSesion(nombreUsuario, contraseña);
    }
}


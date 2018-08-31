/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni.dao;

import com.mysql.jdbc.ConnectionImpl;
import static java.awt.SystemColor.text;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import poo.muni.Usuario;

/**
 *
 * @author Acer
 */
public class UsuarioDao {

    private final SessionFactory sessionFactory;
    private final Connection connection;

    public UsuarioDao(SessionFactory sessionFactory, Connection connection) {
        this.sessionFactory = sessionFactory;
        this.connection= connection;
    }

    public boolean GuardarUsuario(Usuario usuario) {
        
        Session session = sessionFactory.openSession();

        Transaction tx = null;
        try {

            tx = session.beginTransaction();

            session.save(usuario);
            tx.commit();
            return true;

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return false;

        } finally {
            session.close();
        }

    }

    public boolean ValidarUsuario(String nombreUsuario) {
        String lastName = "";
        try {
           
            Statement stmn = connection.createStatement();
            ResultSet rs;

            rs = stmn.executeQuery("SELECT nombreUsuarios FROM Usuario WHERE nombreUsuarios = '" + nombreUsuario + "'");
            while (rs.next()) {
                lastName = rs.getString("nombreUsuarios");
                if (lastName.equals(nombreUsuario)) {
                  
                    return false;
                }
            }
            connection.close();
        } catch (Exception e) {
            System.out.println("Got an Exception! ");
            System.err.println(e.getMessage());
        }
        return true;

    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import poo.muni.Usuario;
import poo.muni.Persona;
import poo.muni.ui.AltaUsuario;
import poo.muni.controller.gestorDeEmpleo;
/**
 *
 * @author oficina2
 */
public class MuniAdministracion {
 private static SessionFactory factory; 
 private static Connection connection;
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       
        
      
  
  
    try {
        
         factory = new AnnotationConfiguration().configure().
                   //addPackage("com.xyz") //add package if used.
                   addAnnotatedClass(Usuario.class).
                   buildSessionFactory();
                   getConnection();
      } 
    catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
    
       new gestorDeEmpleo(factory,connection).run();
      
   }
    
    public static Connection getConnection()throws Exception{
    if(connection == null){
    String url = "jdbc:mysql://localhost:3306/oficinadeempleo";
    connection = DriverManager.getConnection(url,"root","root");
    }
    return connection;
    }
       
    }
    


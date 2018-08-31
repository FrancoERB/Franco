/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.internal.SessionFactoryImpl;

/**
 *
 * @author Capacitacion5
 * 
 */
@Entity
@Table( name = "AbstractPersonas")
public abstract class Persona {

    public static SessionFactory getSessionFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Id
    @GeneratedValue
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "domicilio")
    private String domicilio;
    @Column(name = "email")
    private String email;
    @Column(name = "cuit_cuil")
    private int cuit_cuil;
    @Column(name = "telPrincipal")
    private int telPrincipal;
     @Column(name = "telAlternativo")
    private int telAlternativo;
   

    public Persona() {
    }

    public Persona(String nombre, String domicilio, String email, int cuit_cuil, int telefonoPrincipal, int telefonoAlternativo) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.email = email;
        this.cuit_cuil = cuit_cuil;
        this.telPrincipal = telefonoPrincipal;
        this.telAlternativo = telefonoAlternativo;
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
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cuit_cuil
     */
    public int getCuit_cuil() {
        return cuit_cuil;
    }

    /**
     * @param cuit_cuil the cuit_cuil to set
     */
    public void setCuit_cuil(int cuit_cuil) {
        this.cuit_cuil = cuit_cuil;
    }

    /**
     * @return the telefonoPrincipal
     */
    public int getTelefonoPrincipal() {
        return telPrincipal;
    }

    /**
     * @param telefonoPrincipal the telefonoPrincipal to set
     */
    public void setTelefonoPrincipal(int telefonoPrincipal) {
        this.telPrincipal = telefonoPrincipal;
    }

    /**
     * @return the telefonoAlternativo
     */
    public int getTelefonoAlternativo() {
        return telAlternativo;
    }

    /**
     * @param telefonoAlternativo the telefonoAlternativo to set
     */
    public void setTelefonoAlternativo(int telefonoAlternativo) {
        this.telAlternativo = telefonoAlternativo;
    }
  
    
    
    
}

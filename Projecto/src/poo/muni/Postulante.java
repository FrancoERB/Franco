/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Capacitacion5
 */
@Entity
@Table(name = "postulante")
@SuppressWarnings("ConsistentAccessType")
public class Postulante extends Persona  {

    @Id 
    @GeneratedValue
    @Column(name = "id_postulante")
    private Long id;
    private Usuario usuario;
    private Persona persona;
    private NivelEducativo nivelEducativo;
    private Perfil perfil;
    @Column(name = "movilidad")
    private String movilidad;
    @Column(name = "dispHoraria")
    private String disponibilidadHoraria;
    @Column(name = "docAdicional")
    private String documentacionAdicional;
    private Programa programa;
    @Column(name = "dni")
    private String DNI;
    @Column(name = "Sexo")
    private String sexo;
    @Column(name = "edad")
    private String Edad;
   
    public Postulante() {
    }

    public Postulante(NivelEducativo nivelEducativo, Perfil perfil, String movilidad, String disponibilidadHoraria, String documentacionAdicional, Programa programa, String DNI, String sexo, String Edad, String nombre, String domicilio, String email, int cuit_cuil, int telefonoPrincipal, int telefonoAlternativo) {
        super(nombre, domicilio, email, cuit_cuil, telefonoPrincipal, telefonoAlternativo);
        this.nivelEducativo = nivelEducativo;
        this.perfil = perfil;
        this.movilidad = movilidad;
        this.disponibilidadHoraria = disponibilidadHoraria;
        this.documentacionAdicional = documentacionAdicional;
        this.programa = programa;
        this.DNI = DNI;
        this.sexo = sexo;
        this.Edad = Edad;
    }

    /**
     * @return the nivelEducativo
     */
    @OneToMany(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    public NivelEducativo getNivelEducativo() {
        return nivelEducativo;
    }

    /**
     * @param nivelEducativo the nivelEducativo to set
     */
    public void setNivelEducativo(NivelEducativo nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    /**
     * @return the perfil
     */
    public Perfil getPerfil() {
        return perfil;
    }

    /**
     * @param perfil the perfil to set
     */
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    /**
     * @return the movilidad
     */
    public String getMovilidad() {
        return movilidad;
    }

    /**
     * @param movilidad the movilidad to set
     */
    public void setMovilidad(String movilidad) {
        this.movilidad = movilidad;
    }

    /**
     * @return the disponibilidadHoraria
     */
    public String getDisponibilidadHoraria() {
        return disponibilidadHoraria;
    }

    /**
     * @param disponibilidadHoraria the disponibilidadHoraria to set
     */
    public void setDisponibilidadHoraria(String disponibilidadHoraria) {
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    /**
     * @return the documentacionAdicional
     */
    public String getDocumentacionAdicional() {
        return documentacionAdicional;
    }

    /**
     * @param documentacionAdicional the documentacionAdicional to set
     */
    public void setDocumentacionAdicional(String documentacionAdicional) {
        this.documentacionAdicional = documentacionAdicional;
    }

    /**
     * @return the programa
     */
    public Programa getPrograma() {
        return programa;
    }

    /**
     * @param programa the programa to set
     */
    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the Edad
     */
    public String getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    /**
     * @return the persona
     */
  
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    public Persona getPersona() {
        return persona;
    }

    /**
     * @param persona the persona to set
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    /**
     * @return the usuario
     */
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
     /**
     * @return the id
     */
    @Id
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }
    
    
    
}

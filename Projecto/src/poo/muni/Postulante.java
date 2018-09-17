/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Capacitacion5
 */
@Entity
@Table(name = "Postulante")
public class Postulante extends Persona  {
    @Id @GeneratedValue
    @Column(name = "id_Postulante")
    private NivelEducativo nivelEducativo;
    private Perfil perfil;
    private String movilidad;
    private String disponibilidadHoraria;
    private String documentacionAdicional;
    private Programa programa;
    private int DNI;
    private String sexo;
    private int Edad;

    public Postulante() {
    }

    public Postulante(NivelEducativo nivelEducativo, Perfil perfil, String movilidad, String disponibilidadHoraria, String documentacionAdicional, Programa programa, int DNI, String sexo, int Edad, String nombre, String domicilio, String email, int cuit_cuil, int telefonoPrincipal, int telefonoAlternativo) {
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
    public int getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(int DNI) {
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
    public int getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
    
}

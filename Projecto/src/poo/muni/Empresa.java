/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni;

import sun.util.calendar.BaseCalendar.Date;

/**
 *
 * @author Capacitacion5
 */
public class Empresa extends Persona {
    private Perfil perfil;
    private String representanteLegal;
    private String sede;
    private int cantidadTrabajadores;
    private String razonSocial;
    private Date fechaDeContacto;
    private String tipoContacto;

    public Empresa() {
    }

    public Empresa(Perfil perfil, String representanteLegal, String sede, int cantidadTrabajadores, String razonSocial, Date fechaDeContacto, String tipoContacto, String nombre, String domicilio, String email, int cuit_cuil, int telefonoPrincipal, int telefonoAlternativo) {
        super(nombre, domicilio, email, cuit_cuil, telefonoPrincipal, telefonoAlternativo);
        this.perfil = perfil;
        this.representanteLegal = representanteLegal;
        this.sede = sede;
        this.cantidadTrabajadores = cantidadTrabajadores;
        this.razonSocial = razonSocial;
        this.fechaDeContacto = fechaDeContacto;
        this.tipoContacto = tipoContacto;
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
     * @return the representanteLegal
     */
    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    /**
     * @param representanteLegal the representanteLegal to set
     */
    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    /**
     * @return the sede
     */
    public String getSede() {
        return sede;
    }

    /**
     * @param sede the sede to set
     */
    public void setSede(String sede) {
        this.sede = sede;
    }

    /**
     * @return the cantidadTrabajadores
     */
    public int getCantidadTrabajadores() {
        return cantidadTrabajadores;
    }

    /**
     * @param cantidadTrabajadores the cantidadTrabajadores to set
     */
    public void setCantidadTrabajadores(int cantidadTrabajadores) {
        this.cantidadTrabajadores = cantidadTrabajadores;
    }

    /**
     * @return the razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * @param razonSocial the razonSocial to set
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * @return the fechaDeContacto
     */
    public Date getFechaDeContacto() {
        return fechaDeContacto;
    }

    /**
     * @param fechaDeContacto the fechaDeContacto to set
     */
    public void setFechaDeContacto(Date fechaDeContacto) {
        this.fechaDeContacto = fechaDeContacto;
    }

    /**
     * @return the tipoContacto
     */
    public String getTipoContacto() {
        return tipoContacto;
    }

    /**
     * @param tipoContacto the tipoContacto to set
     */
    public void setTipoContacto(String tipoContacto) {
        this.tipoContacto = tipoContacto;
    }
    
    
    
}

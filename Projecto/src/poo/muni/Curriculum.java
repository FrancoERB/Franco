/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni;

/**
 *
 * @author Capacitacion5
 */
public class Curriculum {
    private String experienciaLaboral;
    private String cursos;
    private Postulante postulante;

    public Curriculum() {
    }

    public Curriculum(String experienciaLaboral, String cursos, Postulante postulante) {
        this.experienciaLaboral = experienciaLaboral;
        this.cursos = cursos;
        this.postulante = postulante;
    }

    /**
     * @return the experienciaLaboral
     */
    public String getExperienciaLaboral() {
        return experienciaLaboral;
    }

    /**
     * @param experienciaLaboral the experienciaLaboral to set
     */
    public void setExperienciaLaboral(String experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }

    /**
     * @return the cursos
     */
    public String getCursos() {
        return cursos;
    }

    /**
     * @param cursos the cursos to set
     */
    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    /**
     * @return the postulante
     */
    public Postulante getPostulante() {
        return postulante;
    }

    /**
     * @param postulante the postulante to set
     */
    public void setPostulante(Postulante postulante) {
        this.postulante = postulante;
    }
    
    
}

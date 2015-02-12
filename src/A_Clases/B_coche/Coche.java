/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_Clases.B_coche;

/**
 *
 * @author Ignacio
 */
public class Coche {
    
    private String modelo;
    private String color;
    private boolean pintMetalizada;
    private String matricula;
    private int anhoMatriculacion;

    /**
     * @return the modelo
     */    
    public String getModelo() {
        return modelo;
    }
    
    public void setModeloColor(String modelo, String color){
        setModelo(modelo);
        setColor(color);
    }
    public String getModeloColor(){
        return getModelo() + " " + getColor();
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the pintMetalizada
     */
    public boolean isPintMetalizada() {
        return pintMetalizada;
    }

    /**
     * @param pintMetalizada the pintMetalizada to set
     */
    public void setPintMetalizada(boolean pintMetalizada) {
        this.pintMetalizada = pintMetalizada;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the anhoMatriculacion
     */
    public int getAnhoMatriculacion() {
        return anhoMatriculacion;
    }

    /**
     * @param anhoMatriculacion the anhoMatriculacion to set
     */
    public void setAnhoMatriculacion(int anhoMatriculacion) {
        this.anhoMatriculacion = anhoMatriculacion;
    }

    

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_Clases.C_semaforo;

/**
 *
 * @author Ignacio
 */
public class Semaforo {
    
    private String color = "rojo";
    private boolean parpadeando = false;
    
    public void bajar(){
        setParpadeando(false);
        
        if (getColor().compareTo("rojo") == 0){
            setColor("ambar");
            setParpadeando(true);
        }
        else if (getColor().compareTo("ambar") == 0)
            setColor("verde");
        else
            setColor("rojo");
    }
    
    public void subir(){
        setParpadeando(false);
        
        if (getColor().compareTo("verde") == 0){
            setColor("ambar");
            setParpadeando(true);
        }
        else if (getColor().compareTo("ambar") == 0)
            setColor("rojo");
        else
            setColor("verde");
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
     * @return the parpadeando
     */
    public boolean isParpadeando() {
        return parpadeando;
    }

    /**
     * @param parpadeando the parpadeando to set
     */
    public void setParpadeando(boolean parpadeando) {
        this.parpadeando = parpadeando;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_Statics.A_Aparato;

/**
 *
 * @author Ignacio
 */
public class Aparato {
    
    private String  nombre    = "";
    private int     consumo   = 0;
    private boolean encendido = false;
    private static  int consTotal = 0;
    
    Aparato(String new_Nombre, int new_Consumo){
        this.nombre = new_Nombre;
        this.consumo = new_Consumo;
    }

    public String getNombre() {
        return nombre;
    }
    public int getConsumo() {
        return consumo;
    }
    public boolean isEncendido() {
        return encendido;
    }
    public void enciendeAparato() {
        if (!encendido){
            this.encendido = true;
            this.consTotal = this.consTotal + consumo;
        }
    }
    public void apagaAparato() {
        if (encendido){
            this.encendido = false;        
            this.consTotal = this.consTotal - consumo;
        }
    }
    public static int getConsumoTotal(){
        return consTotal;
    }
}
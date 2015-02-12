/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Constructores.B_reloj;

import java.text.DecimalFormat;

public class Reloj {

    private int hora;
    private int minuto;
    private int segundo;
    
    public Reloj(){
        hora = 0;
        minuto = 0;
        segundo = 0;
    }
    public Reloj(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public String obtenerHoraHHMMSS(){
        DecimalFormat formato = new DecimalFormat("00");
        return (formato.format(hora) + ":" + formato.format(minuto) + ":" + formato.format(segundo));
    }
    public String obtenerHoraHH24MMSS(){
        DecimalFormat formato = new DecimalFormat("00");
        return (formato.format(hora) + ":" + formato.format(minuto) + ":" + formato.format(segundo));
    }
    public String obtenerHoraHH12MMSS(){
        DecimalFormat formato = new DecimalFormat("00");
        return (formato.format(hora) + ":" + formato.format(minuto) + ":" + formato.format(segundo));
    }
    
}

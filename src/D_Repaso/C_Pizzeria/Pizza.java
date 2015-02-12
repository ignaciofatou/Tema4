/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Repaso.C_Pizzeria;

/**
 *
 * @author Ignacio
 */
public class Pizza {
    
    public static final int BASE_PEQUENA   = 1;
    public static final int BASE_GRANDE    = 2;
    private final double PREC_BASE_PEQUENA = 5.0;
    private final double PREC_BASE_GRANDE  = 7.5;
    private final double PREC_INGR_PEQUENA = 1.0;
    private final double PREC_INGR_GRANDE  = PREC_INGR_PEQUENA * 2;
    private int tipoBase        = 0;
    private int numIngredientes = 0;
    
    public Pizza(int tipoBase, int numIngredientes){
        this.tipoBase        = tipoBase;
        this.numIngredientes = numIngredientes;
    }
    public double getPrecioPizza(){
        //Si el tipo de base es pequeña
        if (this.tipoBase == BASE_PEQUENA)
            return (PREC_BASE_PEQUENA + (PREC_INGR_PEQUENA * this.numIngredientes));
        //Si el tipo de base es grande
        else if (this.tipoBase == BASE_GRANDE)
            return (PREC_BASE_GRANDE  + (PREC_INGR_GRANDE * this.numIngredientes));

        //En caso contrario retornamos 0
        return 0.0;
    }
    public void cambiaNumIngredientes(int numIngredientes){
        this.numIngredientes = numIngredientes;
    }
}

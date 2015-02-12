/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.util.Random;

/**
 * Clase de tipo Marciano
 * Es un Marciano que podra moverse en un eje de corredenadas X e Y
 * Puede cochar con otros marcianos
 * @author Ignacio
 */
public class Marciano {

    private String nombreMarciano;
    private String tipoMarciano;
    private int coordenadaX;
    private int coordenadaY;
    private static int numMovimientos = 0;
    
    //Creamos las constantes
    public static final String TIPO_ACRUX  = "Acrux";
    public static final String TIPO_ELNATH = "Elnath";
    public static final String TIPO_GIRTAB = "Girtab";
    public static final int MAX_POS_X = 50;
    public static final int MAX_POS_Y = 50;

    /**
     * Constructor de la Clase Marciano
     * La posicion Inicial la genera Aleatoriamente
     * @param nombre Nombre del Marciano
     * @param tipo   Tipo de Marciano 'Acrux', 'Elnath' o 'Girtab'
     */
    public Marciano(String nombre, String tipo){
        this.nombreMarciano = nombre;
        setTipoMarciano(tipo);
        
        //Generamos la Posicion X e Y de manera aleatoria
        generaPosAleatoria();
    }

    /**
     * Constructor de la Clase Marciano
     * @param nombre Nombre del Marciano
     * @param tipo Tipo de Marciano 'Acrux', 'Elnath' o 'Girtab'
     * @param posX Posicion X Inicial del Marciano
     * @param posY Posicion Y Inicial del Marciano
     */
    public Marciano(String nombre, String tipo, int posX, int posY){
        this.nombreMarciano = nombre;
        setTipoMarciano(tipo);
        
        //Comprobamos que las Corrdenadas Indicadas no Sobresalgan
        if (posX <= MAX_POS_X)
            this.coordenadaX = posX;
        else
            this.coordenadaX = MAX_POS_X;

        //Comprobamos que las Corrdenadas Indicadas no Sobresalgan
        if (posY <= MAX_POS_Y)
            this.coordenadaY = posY;
        else
            this.coordenadaY = MAX_POS_Y;        
    }
    
    /**
     * Establece el tipo de Marciano
     * @param tipo Tipo de Marciano 'Acrux', 'Elnath' o 'Girtab'
     */
    private void setTipoMarciano(String tipo){
        //Si el Tipo de Marciano no Existe -> Asignamos el Primero
        if ((tipo != TIPO_ACRUX) && (tipo != TIPO_ELNATH) && (tipo != TIPO_GIRTAB))
            this.tipoMarciano = TIPO_ACRUX;
        //Si Existe -> Asignamos el Indicado por parametro
        else
            this.tipoMarciano = tipo;
    }
    
    /**
     * Posiciona de manera aleatoria la posicion inicial del marciano
     * siempre dentro de los margenes establecidos
     */
    private void generaPosAleatoria(){
        //Creamos un objeto de tipo Random
        Random generadorNum = new Random();
        
        //Generamos la Posicion X Aleatoria
        coordenadaX = generadorNum.nextInt(MAX_POS_X + 1);
        
        //Generamos la Posicion Y Aleatoria
        coordenadaY = generadorNum.nextInt(MAX_POS_Y + 1);
    }
    
    /**
     * Nos retorna el Numerode Movimientos globales de todos los Marcianos
     * @return the numMovimientos
     */
    public static int getNumMovimientos() {
        return numMovimientos;
    }
    
    /**
     * Mueve el Marciano hacia arriba
     */
    public void moveUpMarciano(){
        if (getCoordenadaY() < MAX_POS_Y){
            coordenadaY++;
            numMovimientos++;
        }
    }
    /**
     * Mueve el Marciano hacia abajo
     */
    public void moveDownMarciano(){
        if (getCoordenadaY() > 0){
            coordenadaY--;
            numMovimientos++;
        }
    }
    /**
     * Mueve el Marciano hacia la derecha
     */
    public void moveRightMarciano(){
        if (getCoordenadaX() < MAX_POS_X){
            coordenadaX++;
            numMovimientos++;
        }
    }
    /**
     * Mueve el Marciano hacia la izquierda
     */
    public void moveLeftMarciano(){
        if (getCoordenadaX() > 0){
            coordenadaX--;
            numMovimientos++;
        }
    }

    
    /**
     * Retorna el Nombre del Marciano
     * @return the nombreMarciano
     */
    public String getNombreMarciano() {
        return nombreMarciano;
    }

    /**
     * Retorna el tipo de Marciano
     * @return the tipoMarciano
     */
    public String getTipoMarciano() {
        return tipoMarciano;
    }

    /**
     * Retorna una Cadena con el Nombre del Marciano, Tipo y Posicion
     * @return the coordenadaX
     */
    public String getPosicionMarciano() {        
        return getNombreMarciano() + "(" + getTipoMarciano() + ") is in (" + this.getCoordenadaX() + ", " + this.getCoordenadaY() + ")";
    }

    /**
     * Retorna la posicion X
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Retorna la posicion Y
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }
}

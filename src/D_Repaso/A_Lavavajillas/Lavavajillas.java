package D_Repaso.A_Lavavajillas;

/**
 * Permite el uso de un lavavajillas virtual permitiendo manipular su puerta de
 * apertura, encenderlo y apagarlo, así como establecer manualmente el
 * programa en el que se encuentra el proceso de lavado y realizar el avance
 * automático del mismo
 * @author Javier
 */
public class Lavavajillas {

    private boolean abierto;
    private boolean encendido;
    private int programa;
    
    /**
     * Constante predefinida para el programa de Enjuagado del lavavajillas
     */
    public static final int ENJUAGADO = 0;
    /**
     * Constante predefinida para el programa de Prelavado del lavavajillas
     */
    public static final int PRELAVADO = 1;
    /**
     * Constante predefinida para el programa de Lavado del lavavajillas
     */
    public static final int LAVADO = 2;
    /**
     * Constante predefinida para el programa de Aclarado del lavavajillas
     */
    public static final int ACLARADO = 3;
    /**
     * Constante predefinida para el programa de Secado del lavavajillas
     */
    public static final int SECADO = 4;
    
    /**
     * Constructor para un lavavajillas con la puerta cerrada, apagado y con el
     * 3 de 6 programa preparado para el enjuagado
     */
    public Lavavajillas() {
        abierto = false;
        encendido = false;
        programa = ENJUAGADO;
    }
    
    /**
     * Constructor para un lavavajillas con la puerta cerrada, encendido y con
     * el programa situado en el que se indique por parámetro.
     * @param programa Situación inicial del lavavajillas en el momento de
     * crearlo.
     */
    public Lavavajillas(int programa) {
        abierto = false;
        encendido = true;
        this.programa = programa;
    }

    /**
     * Permite abrir o cerrar la puerta del lavavajillas. Si se abre, el lavavajillas
     * debe apagarse automáticamente.
     * @param abierto Indica si se va a abrir (true) o cerrar (false) el lavavajillas.
     */
    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
        if (abierto) {
            setEncendido(false);
        }
    }
        
    /**
     * Obtiene una cadena de caracteres indicando si el lavavajillas está abierto
     * o cerrado.
     * @return "Abierto" o "Cerrado" en cada caso.
     */
    public String getAbierto() {
        if (abierto) {
            return "Abierto";
        } else {
            return "Cerrado";
        }
    }

    /**
     * Obtiene una cadena de caracteres indicando si el
     * lavavajillas está encendido o apagado
     * @return "Encendido" o "Apagado" en cada caso.
     */
    public String getEncendido() {
        if(encendido) {
            return "Encendido";
        } else {
            return "Apagado";
        }
    }

    /**
     * Permite encender o apagar el lavavajillas. Si se va a encencer, comprueba
     * que la puerta esté cerrada (si se encuentra abierta no se enciende).
     * @param encendido Indica si se va a encender (true) o apagar (false) el
     * lavavajillas.
     */
    public void setEncendido(boolean encendido) {
        if(!abierto) {
            this.encendido = encendido;
        }
    }

    /**
     * Obtiene una cadena de caracteres indicando si el programa en el que se
     * encuentra el lavavajillas
     * @return "Enjuagado", "Prelavado", "Lavado" o "Aclarado" para cada posible
     * programa
     */
    public String getPrograma() {
        switch(programa) {
            case ENJUAGADO:
                return "Enjuagado";
            case PRELAVADO:
                return "Prelavado";
            case LAVADO:
                return "Lavado";
            case ACLARADO:
                return "Aclarado";
            case SECADO:
                return "Secado";
        }
        return "";
    }

    /**
     *
     * @param programa Actualiza el estado del programa
     */
    public void setPrograma(int programa) {
        this.programa = programa;
    }
        
    /**
     * Avanza automáticamente el estado del programa en el que se encuentre el
     * lavavajillas, pasando al siguiente programa siguiendo este orden:
     * Enjuagado, prelavado, lavado, aclarado y secado. Cuando el programa
     * anterior es el último (secado), al avanzar el programa del lavavajillas,
     * éste se debe apagar y cambiar el programa al inicial (enjuagado). Para
     * que el lavavajillas pueda avanzar de programa, debe encontrarse
     * encendido.
     */
    public void avanzarPrograma() {
        if(encendido) {
            if(programa<SECADO) {
                programa++;
            } else {
                setEncendido(false);
                setPrograma(ENJUAGADO);
            }
        }
    }
    
    
}
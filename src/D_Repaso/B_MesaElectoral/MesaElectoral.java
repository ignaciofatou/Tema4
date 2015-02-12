/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Repaso.B_MesaElectoral;

/**
 * Con esta clase definimos los atributos y metodos para simular el<br>
 * funcionamiento de una mesa electoral
 * @author Ignacio
 */
public class MesaElectoral {
 
    /**
     * Declaramos los atributos necesarios
     */
    private String  presidente;
    private String  secretario;
    private String  vocal;
    private int     censo;
    private boolean abierta;
    private int     votosPartido0;
    private int     votosPartido1;
    private int     votosPartido2;
    
    /**
     * Constante para identificar al partido politico BB
     */
    public static final int BB   = 0;
    
    /**
     * Constante para identificar al partido politico PSAO
     */
    public static final int PSAO = 1;
    
    /**
     * Constante para identificar al partido politico UI
     */
    public static final int UI   = 2;
    

    /**
     * Constructor para la mesa electoral<br>
     * La mesa electoral estara cerrada por defecto<br>
     * Se establecen los siguientes atributos:<br>
     * Nombre del presidente<br>
     * Nombre del secretario<br>
     * Nombre del vocal<br>
     * Total del censo correspondiente al colegio electoral
     * @param presidente Nombre del presidente
     * @param secretario Nombre del secretario
     * @param vocal Nombre del vocal
     * @param censo Censo total correspondiente al colegio electoral
     */
    public MesaElectoral(String presidente, String secretario, String vocal, int censo){
        this.abierta    = false;        
        this.presidente = presidente;
        this.secretario = secretario;
        this.vocal      = vocal;
        this.censo      = censo;
    }
    
    /**
     * Constructor simple para la mesa electoral<br>
     * La mesa electoral estara abierta por defecto<br>
     * Se establece el siguiente atributo:<br>
     * Total del censo correspondiente al colegio electoral
     * @param censo Censo total correspondiente al colegio electoral
     */
    public MesaElectoral(int censo){
        this.abierta = true;        
        this.censo   = censo;
    }

    /**
     * Abre o cierra la mesa electoral
     * @param estado Abrir o cerrar la mesa<br>
     *   True  - Para abrir la mesa electoral<br>
     *   False - Para cerrar la mesa electoral
     */
    public void setAbierta(boolean estado){
        this.abierta = estado;
    }
    
    /**
     * Incrementa el numero de votos indicado a un determinado partido
     * @param num Numero de votos
     * @param partido Partido politico al que se desea sumar los votos
     */
    public void setVotos(int num, int partido){
        //Si la mesa esta abierta
        if (abierta){
            switch (partido){
                case BB:
                    this.votosPartido0 = num;
                    break;
                case PSAO:
                    this.votosPartido1 = num;
                    break;
                case UI:
                    this.votosPartido2 = num;
                    break;
                default:
                    System.out.println("Error, No Existe el Partido: " + partido);
            }
        }        
    }
    
    /**
     * Incrementa en uno el numero de votos de un determinado partido
     * @param partido Partido politico al que se desea incrementar en 1 el voto
     */
    public void setVotos(int partido){
        //Si la mesa esta abierta
        if (abierta){
            switch (partido){
                case BB:
                    this.votosPartido0++;
                    break;
                case PSAO:
                    this.votosPartido1++;
                    break;
                case UI:
                    this.votosPartido2++;
                    break;
                default:
                    System.out.println("Error, No Existe el Partido: " + partido);
            }
        }        
    }

    /**
     * Recupera el numero de votos de un determinado partido politico
     * @param partido Partido politico del que se va a recuperar los votos
     * @return Retorna el numero de votos del partido politico indicado
     */
    public int getVotos(int partido){
        switch (partido) {
            case BB:
                return this.votosPartido0;                
            case PSAO:
                return this.votosPartido1;
            case UI:
                return this.votosPartido2;
            default:
                System.out.println("Error, No Existe el Partido: " + partido);
                return 0;
        }
    }
    
    /**
     * Calcula el % de participacion de las elecciones
     * @return Retorna el % de participacion de las elecciones
     */
    public int participacion(){
        int numVotosTotal = votosPartido0 + votosPartido1 + votosPartido2;
        float calculo = (float)((float)numVotosTotal / (float)this.censo);
        return Math.round(calculo * 100);
    }
}

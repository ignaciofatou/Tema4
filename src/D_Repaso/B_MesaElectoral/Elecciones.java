/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Repaso.B_MesaElectoral;

/**
 *
 * @author Ignacio
 */
public class Elecciones {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MesaElectoral colegio1 = new MesaElectoral("Ignacio", "Angel", "Pedro", 1000);
        colegio1.setVotos(100, MesaElectoral.BB);
        colegio1.setAbierta(true);
        colegio1.setVotos(300, MesaElectoral.BB);
        colegio1.setVotos(150, MesaElectoral.PSAO);
        colegio1.setVotos(120, MesaElectoral.UI);
        System.out.println("Resultado de las Votaciones en el Colegio 1:");
        System.out.println("    Partido Politico BB: " + colegio1.getVotos(MesaElectoral.BB));
        System.out.println("    Partido Politico PSAO: " + colegio1.getVotos(MesaElectoral.PSAO));
        System.out.println("    Partido Politico UI: " + colegio1.getVotos(MesaElectoral.UI));
        System.out.println("  La participacion ha sido del " + colegio1.participacion() + "%");
        System.out.println();
        
        MesaElectoral colegio2 = new MesaElectoral(500);
        colegio2.setVotos(140, MesaElectoral.BB);
        colegio2.setVotos(72, MesaElectoral.PSAO);
        colegio2.setVotos(58, MesaElectoral.UI);
        System.out.println("Resultado de las Votaciones en el Colegio 2:");
        System.out.println("    Partido Politico BB: " + colegio2.getVotos(MesaElectoral.BB));
        System.out.println("    Partido Politico PSAO: " + colegio2.getVotos(MesaElectoral.PSAO));
        System.out.println("    Partido Politico UI: " + colegio2.getVotos(MesaElectoral.UI));
        System.out.println("  La participacion ha sido del " + colegio2.participacion() + "%");
    }
    
}

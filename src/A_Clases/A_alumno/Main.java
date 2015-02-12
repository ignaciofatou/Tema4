package A_Clases.A_alumno;

public class Main {

    public static void main(String[] args) {
        boolean mayorEdad;
        Alumno alumno1 = new Alumno();
        alumno1.asignaValores("Luis", "Pérez", 1979, 1, "1DAI", "Tarde");
        alumno1.muestraGrupo();
        mayorEdad = alumno1.esMayorEdad();
        if(mayorEdad)
            System.out.println("Es mayor de edad");
        alumno1.cambiaGrupo("2DAI");
        System.out.println("Se ha cambiado al grupo: " + alumno1.dameGrupo());
        
        
        Alumno alumno2 = new Alumno();
        alumno1.asignaValores("Ignacio", "Fatou", 1980, 659292848, "PROG1", "Tarde");
        alumno1.muestraGrupo();
        
        alumno1.cambiaGrupo("PROG2");
        System.out.println("Mi Nuevo Grupo es: " + alumno1.dameGrupo());
        
        System.out.println("Mi Edad es: " + alumno1.dameEdad());
        
        System.out.println("Mi Nombre es: " + alumno1.dameNombre(true));
        System.out.println("Mi Nombre es: " + alumno1.dameNombre(false));
        
    }

}

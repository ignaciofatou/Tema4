package A_Clases.A_alumno;

import java.util.Calendar;
import java.util.GregorianCalendar;

class Alumno {
    String nombre;
    String apellidos;
    int añoDeNacimiento;
    int númeroPersonal;
    String grupo;
    String turnoHorario = "Mañana";

    void cambiaGrupo(String nuevoGrupo) {
        grupo = nuevoGrupo;
    }

    void asignaValores(String nom, String ape, int añoNac, int num, String gru, String turno) {
        //Asignación de valores a los atributos de la clase
        nombre = nom;
        apellidos = ape;
        añoDeNacimiento = añoNac;
        númeroPersonal = num;
        grupo = gru;
        turnoHorario = turno;
        //Mostrar mensaje informativo
        System.out.println("Valores asignados correctamente");
    }

    void muestraGrupo() {
       System.out.println("El alumno: " + nombre + " " + apellidos);
       System.out.println("Pertenece al grupo: " + grupo);
    }

    String dameGrupo() {
        return grupo;
    }
    int dameEdad(){
        Calendar fecha = new GregorianCalendar();
        return (fecha.get(Calendar.YEAR) - añoDeNacimiento);
    }
    String dameNombre(boolean ordenApellidos){
        if (ordenApellidos)
            return apellidos + ", " + nombre;
        else
            return nombre + " " + apellidos;
    }

    boolean esMayorEdad() {
       int añoActual = 2010;

       if(añoActual - añoDeNacimiento >= 18)
           return true;
       else
           return false;
    }

}

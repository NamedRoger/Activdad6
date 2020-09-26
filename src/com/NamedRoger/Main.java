package com.NamedRoger;

public class Main {

    public static void main(String[] args) {
        Alumno rogelio = new Alumno();
        //                          0   1  2  3  4  = 100
        double[] calificaciones = {100,100,60,80,70};
        rogelio.setNombre("Rogelio");
        rogelio.setCalificaciones(calificaciones);

        rogelio.impimirResultados();
    }
}

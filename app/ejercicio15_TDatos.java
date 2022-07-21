package app;

import java.util.Scanner;

public class ejercicio15_TDatos {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int segundos, minutos, horas;

        System.out.print("MOSTRAR LA CANTIDAD DE HORAS Y MINUTOS.\n\n");
        System.out.print("Ingrese una cantidad en segundos : ");
        segundos = Integer.parseInt(ingreso.next());
        horas = segundos / 3600;
        minutos = segundos / 60;
        System.out.println("EN HORAS : " + horas);
        System.out.println("EN MINUTOS : " + minutos);
    }
}

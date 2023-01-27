package manejoarray;

import java.util.Scanner;

// import java.util.ArrayList;
import java.util.ArrayList;

public class ArrayList01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // creación de un ArrayList
        ArrayList<Integer> arreglo = new ArrayList<>();

        arreglo.add(10);
        arreglo.add(20);
        arreglo.add(30);
        arreglo.add(40);
        arreglo.add(50);
        arreglo.add(60);
        arreglo.add(1000);
        arreglo.add(2000);
        arreglo.add(3000);

        for (int i = 0; i < arreglo.size(); i++) {
            System.out.println(arreglo.get(i));
        }

        System.out.println("----------------------------------");

        ArrayList<Double> arreglo2 = new ArrayList<>();

        arreglo2.add(10.2);
        arreglo2.add(11.2);
        arreglo2.add(12.2);
        arreglo2.add(13.2);

        for (int i = 0; i < arreglo2.size(); i++) {
            System.out.println(arreglo2.get(i));
        }

        System.out.println("----------------------------------");

        ArrayList<String> arreglo3 = new ArrayList<>();

        boolean bandera = true;
        String opcion;
        String ciudad;

        while (bandera) {
            System.out.println("Ingrese un país:");
            ciudad = entrada.nextLine();
            arreglo3.add(ciudad);

            System.out.println("Ingresa s si desea salir del proceso:");
            opcion = entrada.nextLine();
            if ("s".equals(opcion) || "S".equals(opcion)) {
                bandera = false;
            }

        }
        System.out.println("-------------------------------------");
        for (int i = 0; i < arreglo3.size(); i++) {
            System.out.printf(" - %s\n", arreglo3.get(i));

        }

        /*
        ArrayList <String> arreglo2 = new ArrayList<>();
        
        ArrayList <Boolean> arreglo4 = new ArrayList<>();
         */
    }
}

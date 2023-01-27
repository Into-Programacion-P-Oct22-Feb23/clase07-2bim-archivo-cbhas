package manejoarray;

import java.util.Scanner;
// import java.util.ArrayList;

import java.util.ArrayList;

public class ArrayList02 {

    public static void main(String[] args) {
        
        ArrayList<String> arreglo3 = obtenerDatos();
        String cadenaFinal = obtenerCadenaFinal(arreglo3);
        System.out.printf("%s\n", cadenaFinal);

    }

    public static ArrayList<String> obtenerDatos() {
        Scanner entrada = new Scanner(System.in);

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
        return arreglo3;
    }

    public static String obtenerCadenaFinal(ArrayList<String> a) {

        String mensaje = "";

        System.out.println("-------------------------------------");
        for (int i = 0; i < a.size(); i++) {
            mensaje = String.format(" - %s", a.get(i));

        }
        return mensaje;

    }
}

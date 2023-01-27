package lectura01;

// Fig. 14.11: LeerArchivoTexto.java
// Este programa lee un archivo de texto y muestra cada registro.
import java.io.File;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeerArchivoTexto {


    public static void leerRegistros01() {

      
        try 
        {
            Scanner entrada = new Scanner(new File("data/datos.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
              
                System.out.println(linea);

            }
            entrada.close();
        } 
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } 
    }
    public static void leerRegistros02() {

    
        try 
        {
            Scanner entrada = new Scanner(new File("data/datosTres.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split(";"));
                System.out.println(lista);

            } 
            entrada.close();
        } 
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } 
    } 
    public static void leerRegistros03() {

                try 
        {
            Scanner entrada = new Scanner(new File("data/datosTres.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split(";"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);
                for (int i = 0; i < linea_partes.size(); i++) {
                    System.out.println(linea_partes.get(i));
                }
                System.out.println("-----------------------------------");

            } 
            entrada.close();
        } 
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } 
    } 

    public static void leerRegistros04() {

        try {
            Scanner entrada = new Scanner(new File("data/datosTres.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split(";"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);

                System.out.printf("Nombre de Materia: %s\n", linea_partes.get(0));
                System.out.printf("Promedio de notas: %s\n", linea_partes.get(1));
                System.out.printf("Nombre de Docente: %s\n", linea_partes.get(2));
                System.out.printf("Tipo de Contrato: %s\n",linea_partes.get(3));

                System.out.println("-----------------------------------");

            }
            entrada.close();
        } catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
    }

    public static void leerRegistros05() {
        try {
            Scanner entrada = new Scanner(new File("data/datosTres.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split(";"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);

                System.out.println(linea_partes.get(2));

                System.out.println("-----------------------------------");

            }
            entrada.close();
        } catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
    }

}

/**
 * ************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y * Pearson Education,
 * Inc. Todos los derechos reservados. *
 *
 ************************************************************************
 */
/*
The java.lang.System.exit() method exits current program by terminating 
running Java virtual machine.
https://www.geeksforgeeks.org/system-exit-in-java/
 */

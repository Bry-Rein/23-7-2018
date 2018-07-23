/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.io.File;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivo = new File("archivo.txt");
        boolean existeArchivo =archivo.exists();
        if (existeArchivo){
             System.out.println("El archivo ya existe");
        }else{
            System.out.println("El archivo no existe");
        }
        try {
            archivo.createNewFile();
        }catch(Exception ex){}
        try {
        PrintWriter pw = new PrintWriter(archivo);
        pw.print("Hola, este es un texto de ejemplo");
        pw.print(":)");
        pw.close();
        } catch (Exception ex){}
        try{
                Scanner sc= new Scanner(archivo);
                System.out.println("El archivo tiene dentro");
                while(sc.hasNextLine())
                {
                    System.out.println(sc.nextLine());
                }
        }catch (Exception ex){}
    }

    }

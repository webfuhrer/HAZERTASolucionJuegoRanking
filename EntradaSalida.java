/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegomayormenor;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EntradaSalida {

    static int mostrarMenu() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Elija una opción:");
        System.out.println("1-Jugar");
        System.out.println("2-Ver ranking");
        System.out.println("3-salir");
        int opcion=sc.nextInt();
        return opcion;
        
    }
    static int preguntarNumero()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Diga un número");
        int n=sc.nextInt();
        return n;
    }

    static String preguntarNombre() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba su nombre");
        String nombre=sc.nextLine();
        return nombre;
    }
}

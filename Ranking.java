/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegomayormenor;

/**
 *
 * @author Admin
 */
public class Ranking {
    private String nombre;
    private int numero_intentos;

    public Ranking(String nombre, int numero_intentos) {
        this.nombre = nombre;
        this.numero_intentos = numero_intentos;
    }

    @Override
    public String toString() {
        return  "nombre=" + nombre + 
                " necesitó " 
                + numero_intentos + " intentos";
    }
    
}

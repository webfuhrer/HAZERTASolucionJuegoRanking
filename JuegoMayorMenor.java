/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegomayormenor;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class JuegoMayorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Ranking> lista_ranking=new ArrayList();
        int opcion_seleccionada=EntradaSalida.mostrarMenu();
        while(opcion_seleccionada!=3)
        {
            switch(opcion_seleccionada)
            {
                case 1:
                    //Caso de jugar
                    int numero_pensado=(int)(Math.random()*9);
                    //int n=obtenerAleatorio(1, 20);
                    int numero_usuario=EntradaSalida.preguntarNumero();
                    int numero_intentos=1;
                    while(numero_pensado!=numero_usuario)
                    {
                        numero_intentos++;
                        if(numero_usuario>numero_pensado)
                        {
                            System.out.println("Menor");
                        }
                        else
                        {
                            System.out.println("Mayor");
                        }
                        numero_usuario=EntradaSalida.preguntarNumero();
                    }
                    
                    String nombre=EntradaSalida.preguntarNombre();
                    Ranking r=new Ranking(nombre, numero_intentos);
                    lista_ranking.add(r);
                    break;
                    
                case 2:
                    //----
                    for(Ranking x: lista_ranking)
                    {
                        System.out.println(x);
                    }
                    
                    break;
                    
            }
            
            
        opcion_seleccionada=EntradaSalida.mostrarMenu();
        }
        
        
    }
    
}

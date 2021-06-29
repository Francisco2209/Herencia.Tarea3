/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciat3;

import ico.fes.animales.Animales;
import ico.fes.animales.Gato;
import ico.fes.animales.Perro;

/**
 *
 * @author PC
 */
public class HerenciaT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animales animal1 = new Animales( 4, "Domésticos", "Mamíferos" );
        System.out.println( animal1 );
        
        Gato gato1 = new Gato( "Siamés", "Miau", "Blanco", 24 );
        System.out.println( gato1 + " La edad es en meses" );
        
        Perro perro1 = new Perro ( "Pastor Alemán", "Guau", "Café con Negro", 56 );
        System.out.println( perro1 + " La edad es en meses" );
    }
    
}

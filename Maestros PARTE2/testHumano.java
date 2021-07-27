/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maestros;

/**
 *
 * @author luisr
 */
public class testHumano {

   
    public static void main(String[] args) {
     
        Human h1 = new Human();
        Human h2 = new Human();
        wizard w2 = new wizard();
        Ninja nj = new Ninja();
        samurai sm = new samurai();
       
        sm.deathBlow(h2);
        sm.meditar();
        sm.howMany();
        
        
        
        
        
        
    }
    
}

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
        
        h1.attack(h2);
        h1.view();
        h2.view();
        
        
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pitagoras;

/**
 *
 * @author luisr
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        pitagoras pi = new pitagoras(); 
        pi.setCatetoA(3);
        pi.setCatetoB(4);
        
        System.out.println(pi.calcular());
        
        
    }
    
}

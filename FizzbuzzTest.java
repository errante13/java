/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisr
 */
public class FizzbuzzTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       int valor =2; 
       
       if(valor%3==0 && valor%5==0){
        System.out.println("fizz Buzz");        
       }
       else if(valor%5==0){
        System.out.println("buzz");        
       }else if (valor%3==0){
           System.out.println("fizz");           
       }else {
       
       System.out.println(valor);
       }
    }
    
    
    
}

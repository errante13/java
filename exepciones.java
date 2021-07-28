/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exepciones;

import java.util.ArrayList;

/**
 *
 * @author luisr
 */
public class exepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Object> myList = new ArrayList<Object>();
            myList.add("13");
            myList.add("Hola Mundo");
            myList.add(48);
            myList.add("Adios Mundo");
        
           
            for(int i = 0; i < myList.size(); i++) {
                try{
                int castedValue = (int) myList.get(i);
                }catch(ClassCastException e){
                    
                    System.out.println("error al castear");
                    System.out.print("posición: "+i+" ");
                    System.out.println("elemento: "+myList.get(i));
                }
                
            }
           
    }

}

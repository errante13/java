/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringManipulator;

/**
 *
 * @author luisr
 */
public class StringManipulator {
    
    
    public String trimAndConcat (String uno, String dos){
    
           return uno.trim().concat(dos.trim());
    }
    
    
    public int getIndexOrNull(String arreglo, char indice){
    
        return arreglo.indexOf(indice);
    }
    
    public int getIndexOrNull(String cadena, String cadenaDos){
    
    
        return cadena.indexOf(cadenaDos);
    
    }
    
    public String concatSubstring(String cadena, int uno, int dos, String cadenaDos ){
    
        
        return   cadena.substring(uno, dos).concat(cadenaDos);
    
    
    }
}
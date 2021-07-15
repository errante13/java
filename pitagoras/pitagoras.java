/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pitagoras;

import java.util.*;
public class pitagoras {
    
    private int catetoA; 
    private int catetoB; 


    public pitagoras(int catetoA, int catetoB) {
        this.catetoA = catetoA;
        this.catetoB = catetoB;
        
    }

    public pitagoras() {
    }

    public int getCatetoA() {
        return catetoA;
    }

    public void setCatetoA(int catetoA) {
        this.catetoA = catetoA;
    }

    public int getCatetoB() {
        return catetoB;
    }

    public void setCatetoB(int catetoB) {
        this.catetoB = catetoB;
    }

    public double calcular (){
    
        return Math.sqrt((catetoA*catetoA)+(catetoB*catetoB)); 
    }
    
    
}

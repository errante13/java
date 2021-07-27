/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maestros;

public class wizard extends Human {

    public wizard() {
        
        super.setHealth(50);
        super.setIntelligence(8);
             
    }

    public void curar (Human humano){
    
        humano.setHealth(humano.getHealth()+(this.getIntelligence()));
        System.out.println("la vida ahora es: "+humano.getHealth());
    }


    public void fireBall(Human humano){
        
        humano.setHealth(humano.getHealth()-(this.getIntelligence()*3));
        System.out.println("la vida ahora es: "+humano.getHealth());
    
    }
  

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author luisr
 */
public class Gorilla extends mammal {

    
    public Gorilla() {
    }

    public Gorilla(int EnergiLvl) {
        super(EnergiLvl);
    }
    
    public void throwSomething(){
        super.setEnergiLvl(getEnergiLvl()-5);
        System.out.println("el gorila a lanzado algo");
        System.out.println(super.displayEnergy());
    
    }
    
    public void eatBananas(){
        
        super.setEnergiLvl(getEnergiLvl()+10);
        System.out.println("Ñami Ñami estaba muy rico");
        System.out.println(super.displayEnergy());
        
    
    }
    
    public void climb (){
        
        super.setEnergiLvl(getEnergiLvl()-10);
        System.out.println("el gorila ha llegado a la cimaaaa ");
        System.out.println(super.displayEnergy());
    
    }
}

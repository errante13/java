
package zoo;

public class Bat extends mammal {

   
    public Bat(int EnergiLvl) {
        super(EnergiLvl);
    }
   
    public void fly(){
    
        super.setEnergiLvl(getEnergiLvl()-50);
        System.out.println("a comenzado a volar!!! "+"*comienza aletear*");
        System.out.println(super.displayEnergy());
    }
    public void eatHuman(){
    
        super.setEnergiLvl(getEnergiLvl()+25);
        System.out.println("delicioso humano!!!! bueno no importa D: ");
        System.out.println(super.displayEnergy());
    }
    public void attackTown(){
    
        super.setEnergiLvl(getEnergiLvl()-100);
        System.out.println("destruccíon y caos en la ciudad ");
        System.out.println(super.displayEnergy());
    
    }
}


package zoo;

public class mammal {
    
    private int EnergiLvl; 
    
    //constructores
    public mammal(){}

    public mammal(int EnergiLvl) {
        this.EnergiLvl = EnergiLvl;
    }
    
    //get and set 

    public int getEnergiLvl() {
        return EnergiLvl;
    }

    public void setEnergiLvl(int EnergiLvl) {
        this.EnergiLvl = EnergiLvl;
    }
    
    //metodos
    
    public int displayEnergy(){
        
        System.out.print("el nivel de energía es: ");
        return this.EnergiLvl; 
    }
    
}

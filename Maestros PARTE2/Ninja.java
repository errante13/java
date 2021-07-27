//Ninja: Establecer un valor predeterminado de stealth en 10.
//Ninja: Agregar un método steal(Human) que roba la cantidad de puntos que tenga el Ninja en 
//       stealth de la salud del otro Human y los agrega a la health del Ninja.
//Ninja: Agregar un método runAway() que reduce su salud en 10.
package Maestros;


public class Ninja extends Human{

    public Ninja() {
           
       super.setStealth(10);
     }

    public void robar(Human humano){
        
        this.setHealth(this.getHealth()+this.getStealth());
        humano.setHealth(humano.getHealth()-this.getStealth());
        this.view();
        System.out.println("stats del humano: ");
        humano.view();
        
    
    }
    
    public void runAway(){
    
        this.setHealth(this.getHealth()-10);
        System.out.println(this.getHealth());
    
    
    }
    
    
}

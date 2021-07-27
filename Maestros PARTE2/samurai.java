/*
    Samurai: Establecer un valor predeterminado de health en 200.
    Samurai: Agregar un método deathBlow(Human) que asesina al otro Human y reduce la health del Samurai a la mitad.
    Samurai: Agregar un método meditate() que curará al Samurai en la mitad de puntos que tenga de health.
    Samurai: Agregar un método howMany() que devuelve el número actual del Samurai.
 */
package Maestros;


public class samurai extends Human{

    public samurai() {
       
        super.setHealth(200);
       
    }
    
    public void deathBlow(Human humano){
        System.out.println(" ASESINATO ");
        humano.setHealth(0);
        this.setHealth(this.getHealth()/2);
        System.out.println("stats humano");
        humano.view();
        System.out.println("stats samurai");
        this.view();
    
    }
    
    public void meditar(){
        
        System.out.println(" MEDITAR ");
        this.setHealth(this.getHealth()+(this.getHealth()/2));
               
    }
    
    public void howMany(){
        
        System.out.println("stats samurai actuales son: ");
        this.view();
       
      }
    
}

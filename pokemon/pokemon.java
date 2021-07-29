
package pokemon;

public class pokemon {
    
    private String nombre; 
    private String tipo;
    private int health;
    private static int count; 

//constructor    
    public pokemon(String nombre, String tipo, int health) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.health = health;
        count++; 
    }
// getter and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
//metodos    
    public void ataque (pokemon pokemon){
    
        pokemon.setHealth( pokemon.getHealth()-10);
    }
    
    
    
}


package pokemon;

public interface pokemonInterface {
    
    default pokemon createPokemon(String name, int health, String type){
            
        pokemon pk = new pokemon(name,type,health);
        return pk;
        
    }
    
    static String pokemonInfo(pokemon pokemon){
        
        return pokemon.getNombre()+" "+pokemon.getTipo()+" "+pokemon.getHealth();
        
      }
    
    static void listPokemon(){
    
        
    
    }
    
}

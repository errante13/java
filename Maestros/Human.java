
package Maestros;

public class Human {
    
    private int trength;
    private int intelligence;
    private int stealth;
    private int health; 

    public Human() {
        this.trength = 3;
        this.intelligence = 3;
        this.stealth = 3;
        this.health = 100;
    }

    public Human(int trength, int intelligence, int stealth, int health) {
        this.trength = trength;
        this.intelligence = intelligence;
        this.stealth = stealth;
        this.health = health;
    }

    public int getTrength() {
        return trength;
    }

    public void setTrength(int trength) {
        this.trength = trength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    public void attack (Human humano){
        
        humano.setHealth(humano.getHealth()-this.trength);
        System.out.println(humano.health);
    }
    
    public void view (){
    
        System.out.println(this.health);
    }
    
    
}


/**
 * Abstract class Creature - 
 * The creature is the main class from which all other battling creatures derive.
 * It is the creature's job to maintain current health values in response to 
 * requests to takeDamage. It also must report if
 * the creature is alive or knocked out. The creature is also responsible for calculating
 * damage delivered based on the creature's strength (1 to str) 
 * 
 * @author Crosbie
 * @version 2025-04 v1.0
 * 
 * 
 * @author James Patti
 * @version 2025-10 new version.
 */
// we will learn what the abstract keyword does in a later chapter
public abstract class Creature
{
    private int str;        // The strength of this creature
    private int max_hp;     // The maximum hit points the creature can have (used if healing enabled)
    private int hp;         // the current numberof hit points the creature has
    
  
    
    /**
     * Create a creature with a given strength and hit point level. 
     * Store max hitpoints to allow for healing to be implemented later
     * Heals must never allow for more hit points than the creature started
     * with
     * @param str the strength of the creature, used to calculate damage
     * @param hp the health of the creature at the start of the simulation, and the current health levels during battle
     */
    public Creature (int str, int hp) {
       this.str = str;
       this.hp = hp;
       max_hp = hp;
    }
    
    
    /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature
     * 
     * ok man randomizer helping so hard!
     * 
     */
    public int attack(){
        // TODO: implement a damage method roll dice and do damage!
        int damageToReturn;
        damageToReturn = Randomizer.nextInt(str);
        
        
        
        return damageToReturn;
    }
    
    
    /**
     * Is this creature still capable of fighting?
     * @return true when current hit point level is greater than zero
     */
    public boolean isAlive() {
        // TODO:  ok should be good.
        
        
        return (hp > 0); //change this
    }
    
    /**
     * Is this creature knockedOut?
     * @return true when current hit point level is less than or equal to zero
     * so hp == 0 or less
     */
    public boolean isKnockedOut() {
        //TODO: implement a method to report if the creature has been killed
        boolean dead;
        if (hp <= 0){
            dead = true;
        }
        else{
            dead = false;
        }
        return dead; //changed!
    }
    
    
    /**
     * takeDamage receives a value for the amount of damage to subtract from 
     * the current total of hit points
     * @param damage value to remove from hit point count
     */
    public void takeDamage(int damage) {
        // TODO: implement this
        hp = hp-damage;
    }
    
    /**
     * ok starting, lets just go basic as basic with a getter for strength;
     * this should return the strength of a creature, 
     * 
     */
    public int returnStrength(){
        
        return str;
    }
}

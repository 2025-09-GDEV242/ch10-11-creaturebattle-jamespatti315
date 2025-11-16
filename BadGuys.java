
/**
 * Write a description of class BadGuys here.
 *
 * @author James Patti
 *  11/17/25
 *  
 *  basis for the badguys factions, working on this then one example then attemot combat part.
 */


public class BadGuys extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_BADGUYS_HP = 25;
    private static final int MIN_BADGUYS_HP = 5;
    private static final int MAX_BADGUYS_STR = 20;
    private static final int MIN_BADGUYS_STR = 5;

    /**
     * Constructor for objects of class Human -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Human and the human class is responsible for
     * return a Human object with values in the appropriate range
     * 
     */
    public BadGuys()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_BADGUYS_STR-MIN_BADGUYS_STR)+MIN_BADGUYS_STR,
            Randomizer.nextInt(MAX_BADGUYS_HP-MIN_BADGUYS_HP)+MIN_BADGUYS_HP        
        );
          
    }
    
    
    // attack() - not overridden because Humans generate basic damage
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

}



/**
 * Write a description of class Android here.
 *
 * @author James Patti
 * @version  11/15/25/
 * 
 * the androids, allies of humans . stronger and more durable but not built for attacking/violence due to 3 laws of robotics.
 * 
 * 
 */
public class Android extends Creature
{
    private static final int MAX_ANDROID_HP = 50;
    private static final int MIN_ANDROID_HP = 10;
    private static final int MAX_ANDROID_STR = 10;
    private static final int MIN_ANDROID_STR = 5;
    
    

    /**
     * Constructor for objects of class Android
     */
    public Android()
    {
        super(
            Randomizer.nextInt(MAX_ANDROID_STR - MIN_ANDROID_STR) + MIN_ANDROID_STR,
            Randomizer.nextInt(MAX_ANDROID_HP - MIN_ANDROID_HP) + MIN_ANDROID_HP
        );
        
    }

    /**
     * here will be the androids special ability
     * the idea is they regain some hp, extended there life but to balance setting there already weak attack to lower, 
     * This should have a random chance and should NOT interfere with "crush kill destroy method" which  its one or the other.
     */
    public void repair()
    {
        // lets start!
        //a 50% chance to activate repair!
        
        int roll = Randomizer.nextInt(100);
        if(roll <=50){
            int repair = Randomizer.nextInt(6)+5; //heals 5 to 10 health, keeps em going!
            
            int strDebuff = Randomizer.nextInt(4)+1; //lowers attack so they weaker.
            
            //apply effects
               alterHP(repair);
               alterStr(-strDebuff);
               
               System.out.println("Android repairs itself for" + repair);
        }
        else{
        System.out.println("Androids attempt at repair failed!");
        }
           
    }
    
    /**
     * here will be the android self-destruct ability, essentially when hp below a certain threshold, 
     * the bot detonates, damaging itself but hopefully wiping enemy in desperation attack, 
     * 
     * @param none,
     * @returns two potentials, nothing if fails...but a explosion damage if activated~ overwriting normal damage calculations
     * 
     * 
     */
    
    public int selfDestruct(){
        if(getHP() <= 10){
             System.out.println("Android is attempting to self-destruct!");
             
             int selfDestructDamage = Randomizer.nextInt(20)+10;
             
             //android succeeds self-destruct
             
             alterHP(-getHP());
             
             return selfDestructDamage;
        }
        return 0; //if fails self-destruct.
    }

        
}
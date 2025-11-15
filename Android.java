
/**
 * Write a description of class Android here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Android extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ANDROID_HP = 25;
    private static final int MIN_ANDROID_HP = 5;
    private static final int MAX_ANDROID_STR = 20;
    private static final int MIN_ANDROID_STR = 5;

    /**
     * Constructor for objects of class Android
     * 
     * NOTES ON ANDROID, GOOD ALIGNED,
     * 
     * there stats are much higher then humans..but attack will be small (3 laws kinda)
     * 
     * with a special ability...maybe healing or a  defence style thing? or regen?
     */
    public  Android()
    {
        // initialise instance variables
        super(
            Randomizer.nextInt(MAX_ANDROID_STR-MIN_ANDROID_STR)+MIN_ANDROID_STR,
            Randomizer.nextInt(MAX_ANDROID_HP-MIN_ANDROID_HP)+MIN_ANDROID_HP        
        );
    }

    
}
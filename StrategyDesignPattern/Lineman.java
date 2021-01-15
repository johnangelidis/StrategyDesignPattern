package csce247.StrategyDesignPattern;
import java.util.Random;
/**
 * A Lineman football player
 */
public class Lineman extends Player {
    /**
     * Creates a new Lineman with the given name
     * @param name
     */
    public Lineman(String name){
        super(name);
        setOffenceBehavior();
        setDefenceBehavior();
    }
    /**
    * A method that sets the offence behavior to an offensive block
    */
    public void setOffenceBehavior(){
        offenceBehavior = new OBlockBehavior();
    }
    /**
     * A method that randomly chooses between a block, strip, or sack behavior and sets the defensive behavior to that
     */
    public void setDefenceBehavior(){
        Random rand = new Random();
        int rand1 = rand.nextInt(2);

        if(rand1==0){
            defenceBehavior = new BlockBehavior();
        }
        else if(rand1==1){
            defenceBehavior = new StripBehavior();
        }
        else{
            defenceBehavior = new SackBehavior();
        }
    }

    /**
     * Displays the name of the lineman with a description
     * @return A string with the variable name and a description
     */    
    public String toString(){
        return name + " is a lineman";
    }
}

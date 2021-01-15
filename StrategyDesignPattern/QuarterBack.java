package csce247.StrategyDesignPattern;
import java.util.Random;

/**
 * A Quarterback football player
 * @author John Angelidis
 */
public class QuarterBack extends Player {
    /**
     * Creates a new QuarterBack with the given name
     * @param name
     */
    public QuarterBack(String name){
        super(name);
        setOffenceBehavior();
        setDefenceBehavior();
    }

    /**
     * A method that randomly chooses between a run and a pass behavior
     */
    public void setOffenceBehavior(){
        Random rand = new Random();
        int rand1 = rand.nextInt(1);
        if(rand1==0){
            offenceBehavior = new RunBehavior();
        }
        else{
            offenceBehavior = new PassBehavior();
        }

    }

    /**
     * A method that sets the defence behavior to null because quarterbacks don't play on defense
     */
    public void setDefenceBehavior(){
        defenceBehavior = new NullBehavior();

    }
    /**
     * Displays the name of the quarterback with a description
     * @return A string with the variable name and a description
     */
    public String toString(){
        return name + " is a quarterback";
    }
}

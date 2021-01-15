package csce247.StrategyDesignPattern;
/**
 * A Receiver football player
 */
public class Receiver extends Player {
    /**
     * Creates a new Receiver with the given name
     * @param name
     */
    public Receiver(String name){
        super(name);
        setOffenceBehavior();
        setDefenceBehavior();
    }
    /**
     * A method that sets the offence behavior to a run behavior
     */
    public void setOffenceBehavior(){
        offenceBehavior = new ReceiveBehavior();
    }

    /**
     * A method that sets the defence behavior to null because receivers don't play on defense
     */
    public void setDefenceBehavior(){
        defenceBehavior = new NullBehavior();
    }

    /**
     * Displays the name of the quarterback with a description
     * @return A string with the variable name and a description
     */
    public String toString(){
        return name + " is a receiver";
    }
}

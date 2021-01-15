package csce247.StrategyDesignPattern;

/**
 * An abstract class for a football player.
 * @author John Angelidis
 */
public abstract class Player {
    protected String name;
    private boolean defence;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    /**
     * Creates a new player with the given name
     * @param Name and defence
     */
    public Player(String name){
        this.name = name;
        this.defence = false;
    }

    /**
     * Abstract class that is implemented in the children classes; chooses an offensive play
     */
    public abstract void setOffenceBehavior();

    /**
     * Abstract class that is implemented in the children classes; chooses a defensive play
     */
    public abstract void setDefenceBehavior();

    /**
     * Chooses between offense and defense based on the value of the boolean defence
     * @return A string of the randomly chosen offensive or defensive behavior
     */
    public String play(){
        if(defence==false){
            return offenceBehavior.play();
        }
        else{
            return defenceBehavior.play();
        }
        
    }
    /**
     * Changes the offense to defense by changing the value of the boolean to true
     */
    public void turnover(){
        defence = true;
        
    }

    /**
     * Displays the name of the player
     * @return a string with the player's name and a description of his position
     */
    public abstract String toString();
}
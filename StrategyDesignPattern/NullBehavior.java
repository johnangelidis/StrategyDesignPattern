package csce247.StrategyDesignPattern;
/**
 * A class that derives from the defence interface and is used when there is a turnover and offensive players can't play
 */
public class NullBehavior implements DefenceBehavior{
    /**
     * A method that indicates that certain players are not playing on defense
     * @return A string that indicates that certain players are not playing on defense
     */
    public String play() {
        return "is not playing.";
    }
    
}
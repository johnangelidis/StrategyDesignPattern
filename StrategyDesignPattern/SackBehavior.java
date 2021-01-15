package csce247.StrategyDesignPattern;
/**
 * A class for sacks that derives from the defence interface
 */
public class SackBehavior implements DefenceBehavior{
    /**
     * A method that causes a sack
     * @return A string that indicates that a sack has occured
     */
    public String play() {
        return "sacks the quarterback";
    }
    
}

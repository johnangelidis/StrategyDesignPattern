package csce247.StrategyDesignPattern;
/**
 * An offensive block behavior class that derives from the offence interface
 */
public class OBlockBehavior implements OffenceBehavior {
    /**
     * A method that causes an offensive block
     * @return a string that indicates an offensive block has occured
     */
    public String play(){
        return "blocks defenders";
    }
}

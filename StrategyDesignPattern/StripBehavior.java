package csce247.StrategyDesignPattern;
/**
 * A class for stripping the ball that derives from the defence interface
 */
public class StripBehavior implements DefenceBehavior{
    /**
     * A method that causes a defender to strip the ball
     * @return A string that indicates the ball was stripped
     */
    public String play(){
        return "strips the ball from runner's hands";
    }
}

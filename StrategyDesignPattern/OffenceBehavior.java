package csce247.StrategyDesignPattern;
/**
 * A parent interface for offensive plays
 */
public interface OffenceBehavior {
    /**
     * A method that will choose an offensive play
     * @return A string that describes the play that was chosen
     */    
    public String play();
}

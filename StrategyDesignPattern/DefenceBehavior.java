package csce247.StrategyDesignPattern;
/**
 * A parent interface for defensive plays
 */
public interface DefenceBehavior {
    /**
     * A method that will choose a defensive play
     * @return A string that describes the play that was chosen
     */
    public String play();
}

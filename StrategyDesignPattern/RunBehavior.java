package csce247.StrategyDesignPattern;
import java.util.Random;
/**
 * A class for running actions that derives from the offence interface
 */
public class RunBehavior implements OffenceBehavior{
    /**
     * A method that randomly chooses between running a drive, running a draw, running a pitch, and running a reverse
     * @return A string that describes the chosen action
     */
    public String play(){
        Random rand = new Random();
        int rand1 = rand.nextInt(3); 

        if(rand1==0){
            return "runs a drive (up the gut)";
        }
        else if(rand1==1){
            return "runs a draw";
        }
        else if(rand1==2){
            return "runs a pitch";
        }
        else{
            return "runs a reverse";
        }
    }
}

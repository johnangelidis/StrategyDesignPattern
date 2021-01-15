package csce247.StrategyDesignPattern;
import java.util.Random;
/**
 * A class for receiving actions that derives from the offence interface
 */
public class ReceiveBehavior implements OffenceBehavior{
    /**
     * A method that randomly chooses between receiving a slant route, an out route, a seem route, a screen pass, and a hail mary.
     * @return A string that describes the chosen action
     */
    public String play(){
        Random rand = new Random();
        int rand1 = rand.nextInt(4); 

        if(rand1==0){
            return "receives a slant route";
        }
        else if(rand1==1){
            return "receives an out route";
        }
        else if(rand1==2){
            return "receives a seem route";
        }
        else if(rand1==3){
            return "receives a screen pass";
        }
        else{
            return "receives a hail mary";
        }
    }        
}


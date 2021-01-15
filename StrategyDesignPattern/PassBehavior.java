package csce247.StrategyDesignPattern;
import java.util.Random;
/**
 * A class for pass actions that derives from the offence interface
 */
public class PassBehavior implements OffenceBehavior{
    /**
     * A method that randomly chooses between throwing a slant route, an out route, a seem route, a screen pass, and a hail mary
     * @return A string that describes the chosen action
     */
    public String play(){
        Random rand = new Random();
        int rand1 = rand.nextInt(4); 

        if(rand1==0){
            return "throws a slant route";
        }
        else if(rand1==1){
            return "throws an out route";
        }
        else if(rand1==2){
            return "throws a seem route";
        }
        else if(rand1==3){
            return "throws a screen pass";
        }
        else{
            return "throws a hail mary";
        }
    }
}

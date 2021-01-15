package csce247.StrategyDesignPattern;
import java.util.Random;
/**
 * A block behavior class that derives from the defence interface
 */
public class BlockBehavior implements DefenceBehavior {
    /**
     * A method that randomly chooses between blocking a kick, a punt, a pass, or a catch
     * @return A string that describes the action that was chosen
     */
    public String play(){
        Random rand = new Random();
        int rand1 = rand.nextInt(3); 

        if(rand1==0){
            return "blocks a kick";
        }
        else if(rand1==1){
            return "blocks a punt";
        }
        else if(rand1==2){
            return "blocks a pass";
        }
        else{
            return "blocks a catch";
        }
    }
}        
    

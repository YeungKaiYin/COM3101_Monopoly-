import java.io.Serializable;

public class Dice implements Serializable {
    private static final long serialVersionUID = 1L;
    private int roll1;
    private int roll2;
    private DisplayScene ds=DisplayScene.getInstance();
    boolean rolled=false;

    public int roll(){
        ds.SetConsole("Press enter to roll");
        ds.Roll();
        //Input.read();
        
        roll1 = (int) (Math.random() * 6 + 1);
        roll2 = (int) (Math.random() * 6 + 1);

        ds.SetConsole("Rolled a " + roll1 + " and " + roll2+" Total :"+(roll1 + roll2));
        return roll1 + roll2;
    }

    //uses value of the dice without rolling
    public int currentRoll(){
        return roll1 + roll2;
    }

    public boolean isDouble(){
        return roll1 == roll2;
    }
}

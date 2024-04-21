import java.util.Scanner;

public class EnterEditorMoneyOption extends PlayerOption {
    private Player player;
    Scanner in = new Scanner(System.in);
    public EnterEditorMoneyOption(Player currentPlayer){
        super("Enter editor Money mode");
        this.player = currentPlayer;
    }

    @Override
    public void action() {
        System.out.println("How much money you do to set?");
        int amount = in.nextInt();
        player.ZeroMoney();
        player.addMoney(amount);
    }
}

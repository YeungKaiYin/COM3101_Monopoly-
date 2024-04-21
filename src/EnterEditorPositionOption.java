import java.util.Scanner;

public class EnterEditorPositionOption extends PlayerOption{
    private Player player;
    Scanner in = new Scanner(System.in);
    public EnterEditorPositionOption(Player currentPlayer) {
        super("Enter editor Position mode");
        this.player = currentPlayer;
    }

    @Override
    public void action() {
        System.out.println("Which position do you go?");
        int numSquare = in.nextInt();
        player.direct_move(numSquare);
    }
}

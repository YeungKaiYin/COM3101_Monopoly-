import java.util.ArrayList;
import java.util.Scanner;

public class EnterEditorOption extends PlayerOption {
    private Player player;
    Monopoly monopoly;
    private ArrayList<Player> allPlayers ; // List of all players to choose from
    private Scanner in = new Scanner(System.in);

    public EnterEditorOption(Player currentPlayer) {
        super("Enter Editor Mode");
        this.player = currentPlayer;

    }

    public void action() {
        if (player.getUnimprovedProperties().isEmpty()) {
            System.out.println("You do not have properties to edit.");
            return;
        }

        Property property = (Property) Input.selectOptions(player.getUnimprovedProperties(), "Select a property to edit");
        if (property == null) {
            System.out.println("No property selected or invalid selection.");
        } else {
            System.out.println("Select the number of the player you want to transfer the property to:");
            for (int i = 0; i < allPlayers.size(); i++) {
                if (allPlayers.get(i) != player) { // Ensure you don't list the current player
                    System.out.println(i + ": " + allPlayers.get(i).getName());
                }
            }

            int selectedPlayerIndex = in.nextInt();
            if (selectedPlayerIndex >= 0 && selectedPlayerIndex < allPlayers.size() && allPlayers.get(selectedPlayerIndex) != player) {
                Player newOwner = allPlayers.get(selectedPlayerIndex);
                property.setOwner(newOwner);
                System.out.println("Property " + property.getName() + " now belongs to " + newOwner.getName());
            } else {
                System.out.println("Invalid player selection.");
            }
        }
    }
}

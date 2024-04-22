import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public abstract class PlayerOption {
    String message;

    public PlayerOption(String message){
        this.message = message;
    }

    abstract public void action();

    public String toString(){
        return message;
    }
}

class ListPropertiesOption extends PlayerOption{
    Player player;

    public ListPropertiesOption(Player currentPlayer){
        super("List Properties");
        player = currentPlayer;
    }

    public void action(){
        player.listProperties();
    }
}

class BuyHouseOption extends PlayerOption{
    Player player;

    public BuyHouseOption(Player currentPlayer){
        super("Buy Houses");
        player = currentPlayer;
    }

    public void action(){
        ColorProperty houseProperty = (ColorProperty) Input.selectOptions(player.getHouseableProperties(), "Select property to purchase house on: ");

        if(houseProperty == null){
            System.out.println("You do not have any properties to place a house on");
        } else {
            houseProperty.addHouse();
        }
    }
}

class MortgageOption extends PlayerOption {
    Player player;

    public MortgageOption(Player currentPlayer){
        super("Mortgage Properties");
        player = currentPlayer;
    }

    public void action(){
        Property mortgageProperty = (Property) Input.selectOptions(player.getUnimprovedProperties(), "Select an unimproved property");

        if(mortgageProperty == null){
            System.out.println("You do not have any unimproved properties to mortgage");
        } else {
            player.mortgage(mortgageProperty);
        }
    }
}

class PayMortgageOption extends PlayerOption {
    Player player;

    public PayMortgageOption(Player currentPlayer){
        super("Pay Mortgage");
        player = currentPlayer;
    }

    public void action(){
        Property payMortProperty = (Property) Input.selectOptions(player.getMortgagedProperties(), "Select a property to pay off mortgage");

        if(payMortProperty == null){
            System.out.println("You do not have any mortgaged properties");
        } else {
            player.payMortgage(payMortProperty);
        }
    }
}

class SellPropertyOption extends PlayerOption {
    Player player;

    public SellPropertyOption(Player currentPlayer){
        super("Sell Unimproved Properties");
        player = currentPlayer;
    }

    public void action(){
        Property sellProperty = (Property) Input.selectOptions(player.getUnimprovedProperties(), "Select a property to sell");

        if(sellProperty == null){
            System.out.println("You do not have properties to sell.");
        } else {
            player.sell(sellProperty);
        }
    }
}

class EnterEditorMoneyOption extends PlayerOption {
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
class EnterEditorPositionOption extends PlayerOption{
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

class SaveGameOption extends PlayerOption {
    private Game game;

    public SaveGameOption(Game game) {
        super("Save Game");
        this.game = game;
    }

    @Override
    public void action() {
        String filename = "game_save.ser";
        GameUtilities.saveGame(game, filename);
        System.out.println("Game saved to '" + filename + "'");
    }
}

class LoadGameOption extends PlayerOption{
    private Game game;
    public LoadGameOption(Game game){
        super("load game");
        this.game = game;
    }
    @Override
    public void action() {
        // Implement loading logic here
        // For simplicity, assume a fixed file name or prompt the user for a file name
        String filename = "game_save.ser";  // This could be dynamic based on user input
        Game loadedGame = GameUtilities.loadGame(filename);
        if (loadedGame != null) {
            System.out.println("Game loaded successfully!");
            game.setGameState(loadedGame);
        } else {
            System.out.println("Failed to load the game.");
        }

    }
}

class EndTurnOption extends PlayerOption{
    Game game;
    Player player;

    public EndTurnOption(Game game, Player currentPlayer){
        super("End Turn");
        this.game = game;
        player = currentPlayer;
    }

    public void action(){
        game.endTurn(player);
    }
}







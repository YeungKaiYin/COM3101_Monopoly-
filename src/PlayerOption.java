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



class MortgageOption extends PlayerOption {
    DisplayScene ds = DisplayScene.getInstance();
    Player player;

    public MortgageOption(Player currentPlayer){
        super("Mortgage Properties");
        player = currentPlayer;
    }

    public void action(){
        Property mortgageProperty = (Property) Input.selectOptions(player.getUnimprovedProperties(), "Select an unimproved property");

        if(mortgageProperty == null){
            ds.AddConsole("You do not have any unimproved properties to mortgage");
        } else {
            player.mortgage(mortgageProperty);
        }
    }
}

class PayMortgageOption extends PlayerOption {
    DisplayScene ds = DisplayScene.getInstance();
    Player player;

    public PayMortgageOption(Player currentPlayer){
        super("Pay Mortgage");
        player = currentPlayer;
    }

    public void action(){
        Property payMortProperty = (Property) Input.selectOptions(player.getMortgagedProperties(), "Select a property to pay off mortgage");

        if(payMortProperty == null){
            ds.AddConsole("You do not have any mortgaged properties");
        } else {
            player.payMortgage(payMortProperty);
        }
    }
}

class SellPropertyOption extends PlayerOption {
    DisplayScene ds = DisplayScene.getInstance();
    Player player;

    public SellPropertyOption(Player currentPlayer){
        super("Sell Unimproved Properties");
        player = currentPlayer;
    }

    public void action(){
        Property sellProperty = (Property) Input.selectOptions(player.getUnimprovedProperties(), "Select a property to sell");

        if(sellProperty == null){
            ds.AddConsole("You do not have properties to sell.");
        } else {
            player.sell(sellProperty);
        }
    }
}

class EnterEditorMoneyOption extends PlayerOption {
    DisplayScene ds = DisplayScene.getInstance();
    private Player player;
    Scanner in = new Scanner(System.in);
    public EnterEditorMoneyOption(Player currentPlayer){
        super("Enter editor Money mode");
        this.player = currentPlayer;
    }

    @Override
    public void action() {
        //System.out.println("How much money you do to set?");
        int amount = Integer.parseInt(ds.SetGetInputDialog("How much money you do to set?"));
        player.ZeroMoney();
        player.addMoney(amount);
    }
}
class EnterEditorPositionOption extends PlayerOption{
    DisplayScene ds = DisplayScene.getInstance();
    private Player player;
    Scanner in = new Scanner(System.in);
    public EnterEditorPositionOption(Player currentPlayer) {
        super("Enter editor Position mode");
        this.player = currentPlayer;
    }

    @Override
    public void action() {
        //System.out.println("Which position do you go?");
        int numSquare = Integer.parseInt(ds.SetGetInputDialog("Which position do you go?"));
        player.direct_move(numSquare);
        ds.setIcon(player);
    }
}

class SaveGameOption extends PlayerOption {
    DisplayScene ds = DisplayScene.getInstance();
    private Game game;

    public SaveGameOption(Game game) {
        super("Save Game");
        this.game = game;
    }

    @Override
    public void action() {
        String filename = "game_save.ser";
        GameUtilities.saveGame(game, filename);
        ds.SetConsole("Game saved to '" + filename + "'");
    }
}

class LoadGameOption extends PlayerOption{
    DisplayScene ds = DisplayScene.getInstance();
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
            ds.SetConsole("Game loaded successfully!");
            game.setGameState(loadedGame);
        } else {
            ds.SetConsole("Failed to load the game.");
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







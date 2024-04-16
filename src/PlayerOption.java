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


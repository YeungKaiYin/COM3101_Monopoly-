import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Player implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<Property> properties = new ArrayList<Property>();
    private final String name;
    private int position;
    private int money = 1500;
    private int id;
    private ImageIcon image;
    private int previousPosition;
    DisplayScene ds=DisplayScene.getInstance();


    public Player(String name){
        this.name = name;
        position = 0;
        ds.SetPlayerId();
        previousPosition = 100;
    }


    public String getName() { return name; }

    public int getPosition() { return position; }

    public int getMoney() { return money; }
    
    public void setId(int id) { this.id=id; }
    public int getId() { return id; }

    public ImageIcon getImage(){
        return image;
    }
    public void setImage(ImageIcon image){
        this.image = image;
    }
    public int getPreviousPosition() {
        return previousPosition;
    }

    public int setPreviousPosition(int previousPosition) {
        this.previousPosition = previousPosition;
        return previousPosition;
    }


    public void addMoney(int addMoney){
        if(money < -addMoney){
            broke(-addMoney - money);
        }

        this.money += addMoney;
    }

    private void broke(int amountNeeded){
        ds.SetConsole("You are missing $" + amountNeeded);
        List<PlayerOption> options = Arrays.asList(
                new MortgageOption(this)
        );
    }

    public void pay(Player receiving, int amount){
        receiving.addMoney(amount);
        addMoney(-amount);
    }


    public void move(int numSquares, Board board){
        position += numSquares;

        //if pass GO
        if(position >= 23){
            ds.SetConsole(name + " passed GO and collected $200");
            money += 200;
            position %= 23;
        }

        ds.SetConsole("Landed on " + board.getCurrentSquare(this));
        board.getCurrentSquare(this).doAction(this);
    }
    public void ZeroMoney(){
        money=0;
    }
    public void direct_move(int numSquares){
        position = numSquares;
    }

    public void moveTo(int toPosition, Board board){
        move((23 - position + toPosition) % 23, board);
    }

    //add property to Player's properties
    public void buy(Property property){
        addMoney(-property.getPrice());
        properties.add(property);
        sortPropertiesByGroup(properties);
    }

    public void sell(Property property){
        addMoney(property.getPrice() / 2);
        property.setOwner(null);
    }

    public void mortgage(Property property){
        property.mortgaged = true;
        addMoney(property.getPrice() / 2);
    }

    public void payMortgage(Property property){
        property.mortgaged = false;
        addMoney( (int) (-property.getPrice() * 0.55) );
    }

    public int getWorth(){
        int total = 0;

        for(Property p : properties){
            if(p instanceof ColorProperty){
                total += (((ColorProperty) p).getNumHouses() * ((ColorProperty) p).getHouseCost()) / 2;
            }

            total += p.getPrice() / 2;
        }

        return total + money;
    }


    private void sortPropertiesByGroup(ArrayList<Property> properties){
        ArrayList<Property> sorted = new ArrayList<>();

        for(Property property : properties){
                sorted.add(property);

        }
        Collections.sort(sorted);


        this.properties = sorted;
    }

    public void listProperties(){
        if(properties.isEmpty()){
            ds.SetConsole("You do not own any properties");
        }
        else
        {
            ds.SetConsole((""));
        }
        for(Property property : properties){
            
            ds.AddConsole(property.getName()+"\n");
        }
    }
    //returns list of all properties that Player owns color group

    public ArrayList<Property> getUnimprovedProperties(){
        ArrayList<Property> unimproved = new ArrayList<>();
        for(Property property : properties){
            if(property instanceof ColorProperty && ((ColorProperty) property).getNumHouses() != 0);
            else {
                unimproved.add(property);
            }
        }

        return unimproved;
    }

    public ArrayList<Property> getMortgagedProperties(){
        ArrayList<Property> mortgaged = new ArrayList<>();
        for(Property property : properties){
            if(property.mortgaged){
                mortgaged.add(property);
            }
        }

        return mortgaged;
    }

    //check if property is in Player's properties
}

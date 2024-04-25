public abstract class Property extends Square {
    private final int price;
    private final int rent;
    private final int pos;
    protected Player owner;
    public boolean mortgaged;
    DisplayScene ds=DisplayScene.getInstance();

    public Property(String name, int price, int rent,int pos){
        super(name,pos);
        this.price = price;
        this.rent = rent;
        this.pos=pos;
    }

    public int getPrice(){
        return price;
    }

    public int getRent(){
        return rent;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player newOwner){
        owner = newOwner;
    }

    public void offerBuy(Player currentPlayer){
        String response = ds.SetGetInputDialog("Would you like to buy " + name + " for $" + price + "?(y/n)");

        if(response.contains("y")){
            bought(currentPlayer);
            ds.SetLabel(pos,currentPlayer.getName());
        }
    }

    public void bought(Player currentPlayer){
        owner = currentPlayer;
        currentPlayer.buy(this);
    }

    @Override
    public void doAction(Player currentPlayer) {
        if(currentPlayer == owner);
            //square is owned by the currentPlayer
        else if(owner != null) {
            //square is owned by someone else
            if(!mortgaged){
                ds.AddConsole(currentPlayer.getName() + " paid " + owner.getName() + " $" + getRent() + " in rent");
                currentPlayer.pay(owner, getRent());
            }
        } else {
            //square can be bought
            offerBuy(currentPlayer);
        }
    }

    public String getName() {
        return name;
    }
}

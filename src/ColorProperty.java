public class ColorProperty extends Property {

    private final Group group;

    private int numHouses = 0; //number of houses currently on property
    private final int houseCost;

    //rent based on number of houses
    private final int rent1;

    public enum Group{
        BROWN(2),
        SKY(3),
        PINK(3),
        ORANGE(3),
        RED(3),
        YELLOW(3),
        GREEN(3),
        BLUE(2);

        public final int maxInGroup;

        Group(int maxInGroup){
            this.maxInGroup = maxInGroup;
        }
    }

    public ColorProperty(String name, Group group, int price, int rent, int rent1){
        super(name, price, rent);
        this.group = group;
        this.rent1 = rent1;

        switch(group){
            case BROWN:
            case SKY:
                houseCost = 50;
                break;
            case PINK:
            case ORANGE:
                houseCost = 100;
                break;
            case RED:
            case YELLOW:
                houseCost = 150;
                break;
            case GREEN:
            case BLUE:
                houseCost = 200;
                break;
            default:
                houseCost = -1;
        }
    }

    public Group getGroup() { return group; }

    public int getNumHouses() { return numHouses; }

    public int getHouseCost() {
        return houseCost;
    }

    public void addHouse(){
        getOwner().addMoney(-houseCost);
        numHouses++;
        if(numHouses == 5){
            System.out.println("Purchased a hotel on " + name + " for " + houseCost);
        } else {
            System.out.println("Purchased a house on " + name + " for " + houseCost);
        }
    }

    @Override
    public int getRent() {
        int rent = 0;
        switch(numHouses){
            case 0:
                rent = super.getRent();
                if(getOwner().ownsGroup(group)){
                    rent *= 2;
                }
                break;
            case 1:
                rent = rent1;
                break;
        }

        return rent;
    }
}
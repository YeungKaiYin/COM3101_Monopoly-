public class ColorProperty extends Property {

    private final Group group;

    private int numHouses = 0; //number of houses currently on property
    private final int houseCost;

    //rent based on number of houses
    private final int rent;
    private final int pos;

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

    public ColorProperty(String name, Group group, int price, int rent,int pos){
        super(name, price, rent,pos);
        this.group = group;
        this.rent = rent;
        this.pos = pos;

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


    @Override
    public int getRent() {
        return rent;
    }
}

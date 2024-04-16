import java.util.ArrayList;

public class Board {
    private final Square[] board = new Square[23];
    public Dice dice;
    public ArrayList<Player> players;

    public Board(Dice dice, ArrayList<Player> players) {
        this.dice = dice;
        this.players = players;

        //creating all squares on the board
        for (int i = 0; i < 23; i++) {
            board[i] = createSquare(i);
            board[i].index = i;
        }


    }

    public Square getSquareAt(int position) {
        return board[position];
    }

    public Square getCurrentSquare(Player player) {
        return getSquareAt(player.getPosition());
    }

    //TODO finish board initialization
    private Square createSquare(int position) {
        switch (position) {
            case 0:
                return new Square("GO");
            case 1:
                return new ColorProperty("Tin Shui Wai", ColorProperty.Group.BROWN, 60, 2, 10);
            case 2:
                return new ColorProperty("Cheung Chau", ColorProperty.Group.BROWN, 60, 4, 20);
            case 3:
                return new ColorProperty("Ap Lei Chau", ColorProperty.Group.BROWN, 60, 4, 20);
            case 4:
                return new ColorProperty("Kwun Tong", ColorProperty.Group.SKY, 100, 6, 30);
            case 5:
                return new ColorProperty("Lam Tin", ColorProperty.Group.SKY, 100, 6, 30);
            case 6:
                return new ColorProperty("Tuen Mun", ColorProperty.Group.PINK, 100, 6, 30);
            case 7:
                return new ColorProperty("Yuen Long", ColorProperty.Group.PINK, 100, 6, 30);
            case 8:
                return new ColorProperty("Tai Po", ColorProperty.Group.PINK, 100, 6, 30);
            case 9:
                return new ColorProperty("Tai Wai", ColorProperty.Group.ORANGE, 120, 8, 40);
            case 10:
                return new ColorProperty("Sha Tin", ColorProperty.Group.ORANGE, 100, 6, 30);
            case 11:
                return new ColorProperty("Ma On Shan", ColorProperty.Group.ORANGE, 140, 10, 50);
            case 12:
                return new ColorProperty("Tseung Kwan O", ColorProperty.Group.RED, 100, 6, 30);
            case 13:
                return new ColorProperty("Tsuen Wan", ColorProperty.Group.RED, 140, 10, 50);
            case 14:
                return new ColorProperty("Aberdeen", ColorProperty.Group.RED, 160, 12, 60);
            case 15:
                return new ColorProperty("Hung Hom", ColorProperty.Group.YELLOW, 160, 12, 60);
            case 16:
                return new ColorProperty("Tsim Sha Tsui", ColorProperty.Group.YELLOW, 180, 14, 70);
            case 17:
                return new ColorProperty("West Kowloon", ColorProperty.Group.YELLOW, 160, 12, 60);
            case 18:
                return new ColorProperty("Causeway Bay", ColorProperty.Group.GREEN, 180, 14, 70);
            case 19:
                return new ColorProperty("Wan Chai", ColorProperty.Group.GREEN, 200, 16, 80);
            case 20:
                return new ColorProperty("Central", ColorProperty.Group.GREEN, 200, 16, 80);
            case 21:
                return new ColorProperty("Pok Fu Lam", ColorProperty.Group.BLUE, 220, 18, 90);
            case 22:
                return new ColorProperty("The Peak", ColorProperty.Group.BLUE, 200, 16, 80);
            default:
                return null;
        }
    }
}
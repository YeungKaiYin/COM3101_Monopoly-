import java.util.ArrayList;

public class Monopoly {
    public static void main(String[] args){
        Dice dice = new Dice();
        ArrayList<Player> players = createPlayers(2);
        Board board = new Board(dice, players);

        Game game = new Game(dice, board, players);

        game.turn(players.get(0));
    }

    static ArrayList<Player> createPlayers(int numPlayers){
        ArrayList<Player> players = new ArrayList<>();

        for(int i = 1; i <= numPlayers; i++){
            System.out.print("Player " + i + " name: ");
            players.add(new Player(Input.read()));
        }

        return players;
    }
}

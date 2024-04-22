import java.io.*;

public class GameUtilities {
    public static void saveGame(Game game, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(game);
            System.out.println("Game has been saved successfully to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving the game: " + e.getMessage());
        }
    }
    public static Game loadGame(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Game) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

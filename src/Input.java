import java.util.List;
import java.util.Scanner;

public class Input {

    public static String read(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    //outputs numbered list of options and returns the selected one
    public static Object selectOptions(List<?> list, String message){
        DisplayScene ds = DisplayScene.getInstance();
        if(list.size() == 0) return null;

        ds.SetConsole(message + " (Enter a number 1 - " + list.size() + ")");

        for(int i = 1; i <= list.size(); i++){
            ds.AddConsole(i + ". " + list.get(i - 1).toString());
        }

        try {
            int input = Integer.parseInt(ds.SetGetInputDialog(ds.GetConsole()));
            return list.get(input - 1);

        } catch(NumberFormatException | IndexOutOfBoundsException e){
            System.out.println("Enter a valid number");
            return selectOptions(list, message);
        }
    }
}

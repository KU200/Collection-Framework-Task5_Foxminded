import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n" + "Input the string that is needed to returns the number of unique characters in it and press Enter or input 'e' and press Enter for exit " + "\n");
            Scanner keyboard = new Scanner(System.in);
            String keyboardInput = keyboard.nextLine();
            if (!keyboardInput.equals("e")) {
                CharacterCounter characterCounter = new CharacterCounter();
                System.out.println("\n" + keyboardInput + "\n" + "\n" + characterCounter.outResult(keyboardInput));
            } else {
                System.out.println("\n" + "The application has been closed");
                break;
            }
        }
    }
}

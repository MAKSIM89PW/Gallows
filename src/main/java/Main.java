import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Начать новую игру(Y) или выйти(N)?");
        char choice = readInput();
        if (choice == 'Y'){
            StartGame.startGame();
        } else if (choice == 'N') {
            scanner.close();
            System.exit(0);
        } else {
            System.out.println("Еще раз");
        }
    }

    static char readInput() {
        return scanner.nextLine().toUpperCase(Locale.ROOT).charAt(0);
    }
}

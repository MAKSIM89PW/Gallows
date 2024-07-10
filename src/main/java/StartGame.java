import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StartGame {
    static int errorCount;                 // Учет ошибок
    static List<Character> errorChar;      // Учет неверно указанных букв
    static FieldMap fieldmap;              // Текущий вид виселицы
    static String hiddenWord;              // Загаданное слово
    static String displayingTheHiddenWord; // Отображение загаданного слово
    static final int errorCountGame = 6;   // Допустимые ошибки

    public static void startGame(){
        String[] field = { "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX"};
        errorCount = 0;
        errorChar = new ArrayList<>();
        hiddenWord = RandomWords.getWords().toUpperCase(Locale.ROOT);
        fieldmap = FieldMap.valueOf(field[errorCount]);
        displayingTheHiddenWord = "*".repeat(hiddenWord.length());
        boolean vinner = true;

        while(vinner) {
            System.out.println(fieldmap);
            System.out.println("слово:  " + displayingTheHiddenWord);
            System.out.println("ошибка (" + errorCount + "): " + errorChar);
            System.out.println("введите букву: ");
            Character input = Main.readInput();
            System.out.println("\n \n \n \n \n \n \n \n \n \n");

            if (hiddenWord.contains(String.valueOf(input))) {
                char[] temp = hiddenWord.toCharArray();
                char[] tempCurrent = displayingTheHiddenWord.toCharArray();

                for(int i = 0; i < displayingTheHiddenWord.length(); i++) {
                    if(temp[i] == input) {
                        tempCurrent[i] = input;
                    }
                }

                displayingTheHiddenWord = new String(tempCurrent);
                if(!displayingTheHiddenWord.contains("*")) {
                    vinner = false;
                }
            } else {
                if(errorChar.contains(input)) {
                    System.out.println("буква повторяеться");

                } else {
                    errorChar.add(input);
                }
                errorCount++;
                fieldmap = FieldMap.valueOf(field[errorCount]);
                if(errorCount == errorCountGame) vinner = false;
            }
        }
        if(errorCount != errorCountGame) {
            System.out.println("\n \n \tВы выйграли \n \n");
        } else {
            System.out.println(FieldMap.SIX);
            System.out.println("\n \tМного ошибок - проигрыш \n \n ");
        }
    }
}

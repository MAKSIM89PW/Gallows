import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StartGame {
    static int errorCount;                 // Учет ошибок
    static List<Character> errorChar;      // Учет неверно указанных букв
    static FieldMap fieldmap;              // Текущий вид виселицы
    static String hiddenWord;              // Загаданное слово
    static String displayingTheHiddenWord; // Отображение загаданного слово


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
        }
    }
}

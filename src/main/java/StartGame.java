import java.util.Locale;

public class StartGame {
    static int errorCount;                 // Учет ошибок
    static FieldMap fieldmap;              // Текущий вид виселицы
    static String hiddenWord;              // Загаданное слово
    static String displayingTheHiddenWord; // Отображение загаданного слово


    public static void startGame(){
        String[] field = { "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX"};
        errorCount = 0;
        hiddenWord = RandomWords.getWords().toUpperCase(Locale.ROOT);
        fieldmap = FieldMap.valueOf(field[errorCount]);
        displayingTheHiddenWord = "*".repeat(hiddenWord.length());
    }
}

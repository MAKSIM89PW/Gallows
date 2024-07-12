import java.util.Random;

public class SummerWords {

    public static String getRandomSummerWord() {
        String[] words = {
                "Солнце", "Пляж", "Отпуск", "Мороженое", "Купание",
                "Пикник", "Барбекю", "Очки", "Песок", "Волны",
                "Загар", "Путешествие", "Жара", "Каникулы", "Отдых"
        };
        Random random = new Random();
        int index = random.nextInt(words.length);
        return words[index];
    }

    public static String obscureWord(String word) {
        return "*".repeat(word.length());
    }
}

import java.util.*;

public class RandomWords {

    public static String getWords() {
        List<String> listWords = new ArrayList<>(Arrays.asList(
                "солнце",  "море", "пляж",
                "отпуск", "жара",
                "загар", "каникулы",
                "купание", "арбуз", "песок",
                "пикник", "шлёпанцы", "коктейль",
                "прогулка", "лагерь"));
        int random = new Random().nextInt(listWords.size());
        return listWords.get(random);
    }

}

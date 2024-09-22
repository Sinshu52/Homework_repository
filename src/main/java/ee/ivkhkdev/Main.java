package ee.ivkhkdev;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String text = "Съешь ещё этих французских булок и галет, да выпей же чаю с молоком.";
        boolean allLettersPresent = checkAllRussianLetters(text);
        System.out.println("Содержит все буквы русского алфавита: " + allLettersPresent);
    }

    public static boolean checkAllRussianLetters(String text) {
        Set<Character> alphabet = initializeAlphabet();


        for (char c : text.toLowerCase().toCharArray()) {
            alphabet.remove(c);
        }


        return alphabet.isEmpty();
    }

    private static Set<Character> initializeAlphabet() {
        Set<Character> alphabet = new HashSet<>();
        for (char c = 'а'; c <= 'я'; c++) {
            alphabet.add(c);
        }
        alphabet.add('ё');
        return alphabet;
    }
}

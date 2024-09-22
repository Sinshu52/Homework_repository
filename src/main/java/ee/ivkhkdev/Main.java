package ee.ivkhkdev;

import java.util.Scanner;

public class Main {
    private static final String[] COLORS = {"зеленый", "красный", "желтый", "белый", "черный"};
    private static final String[] ANIMALS = {"крысы", "коровы", "тигра", "зайца", "дракона", "змеи", "лошади", "овцы", "обезьяны", "курицы", "собаки", "свиньи"};
    private static final int CYCLE_START_YEAR = 1984;
    private static final int CYCLE_LENGTH = 60;

    public static String getYearDescription(int year) {
        int cyclePosition = (year - CYCLE_START_YEAR) % CYCLE_LENGTH;
        String color = COLORS[(cyclePosition / 12) % COLORS.length];
        String animal = ANIMALS[cyclePosition % ANIMALS.length];

        return String.format("Год %s %s", color, animal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        String yearDescription = getYearDescription(year);
        System.out.println(yearDescription);
    }
}

package ee.ivkhkdev;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int totalQuestions = 5; // Количество вопросов
        int correctAnswers = 0;

        for (int i = 0; i < totalQuestions; i++) {
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;

            System.out.printf("What's %d * %d? : ", num1, num2);
            int userAnswer = scanner.nextInt();

            if (userAnswer == num1 * num2) {
                System.out.println("\u001B[32mПравильно!\u001B[0m");
                correctAnswers++;
            } else {
                System.out.printf("\u001B[31mНеправильно! Правильный ответ: %d\u001B[0m%n", num1 * num2);
            }
        }

        // Вывод итогов
        displayResults(correctAnswers, totalQuestions);
    }

    private static void displayResults(int correctAnswers, int totalQuestions) {
        System.out.printf("Вы правильно ответили на %d из %d вопросов.%n", correctAnswers, totalQuestions);

        if (correctAnswers == totalQuestions) {
            System.out.println("Молодец!");
        } else if (correctAnswers >= totalQuestions * 0.6) { // >= 60% правильных ответов
            System.out.println("Надо бы еще поучить...");
        } else {
            System.out.println("Срочно нужно учить таблицу умножения!");
        }
    }
}

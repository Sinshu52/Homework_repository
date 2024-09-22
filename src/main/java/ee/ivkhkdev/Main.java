package ee.ivkhkdev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] temperatureData = {
                new int[31], // Январь
                new int[28], // Февраль
                new int[31], // Март
                new int[30], // Апрель
                new int[31], // Май
                new int[30], // Июнь
                new int[31], // Июль
                new int[31], // Август
                new int[30], // Сентябрь
                new int[31], // Октябрь
                new int[30], // Ноябрь
                new int[31]  // Декабрь
        };


        fillTemperatureData(temperatureData);

        // Запрос даты от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Введите день (1-" + temperatureData[month - 1].length + "): ");
        int day = scanner.nextInt();


        System.out.println("Температура " + month + "/" + day + ": " + temperatureData[month - 1][day - 1]);


        findExtremes(temperatureData);


        calculateAndDisplayMonthlyAverages(temperatureData);
    }

    
    private static void fillTemperatureData(int[][] temperatureData) {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < temperatureData[i].length; j++) {
                if (i < 2 || i > 9) { // Зима (Декабрь, Январь, Февраль)
                    temperatureData[i][j] = (int) (Math.random() * 10) - 5;
                } else if (i >= 2 && i <= 4) { // Весна (Март, Апрель, Май)
                    temperatureData[i][j] = (int) (Math.random() * 15) + 5;
                } else if (i >= 5 && i <= 7) { // Лето (Июнь, Июль, Август)
                    temperatureData[i][j] = (int) (Math.random() * 20) + 10;
                } else { // Осень (Сентябрь, Октябрь, Ноябрь)
                    temperatureData[i][j] = (int) (Math.random() * 15) + 5;
                }
            }
        }
    }


    private static void findExtremes(int[][] temperatureData) {
        int hottestMonth = 0, hottestDay = 0;
        int coldestMonth = 0, coldestDay = 0;
        int hottestTemp = Integer.MIN_VALUE;
        int coldestTemp = Integer.MAX_VALUE;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < temperatureData[i].length; j++) {
                if (temperatureData[i][j] > hottestTemp) {
                    hottestTemp = temperatureData[i][j];
                    hottestMonth = i + 1;
                    hottestDay = j + 1;
                }
                if (temperatureData[i][j] < coldestTemp) {
                    coldestTemp = temperatureData[i][j];
                    coldestMonth = i + 1;
                    coldestDay = j + 1;
                }
            }
        }

        System.out.println("Самый жаркий день: " + hottestMonth + "/" + hottestDay + " с температурой " + hottestTemp);
        System.out.println("Самый холодный день: " + coldestMonth + "/" + coldestDay + " с температурой " + coldestTemp);
    }


    private static void calculateAndDisplayMonthlyAverages(int[][] temperatureData) {
        for (int i = 0; i < 12; i++) {
            int sum = 0;
            for (int j = 0; j < temperatureData[i].length; j++) {
                sum += temperatureData[i][j];
            }
            double avgTemp = (double) sum / temperatureData[i].length;
            System.out.printf("Средняя температура за месяц %d: %.2f\n", i + 1, avgTemp);
        }
    }
}

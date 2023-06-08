//Пусть дан произвольный список целых чисел.
//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение

import java.util.ArrayList;

public class TASK3 {
    public static void main(String[] args) {
        // Создали список чисел
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // Затем добавили только нечетные числа
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }

        // Находим min значение
        int min = oddNumbers.get(0);
        for (int number : oddNumbers) {
            if (number < min) {
                min = number;
            }
        }

        // Потом max значение
        int max = oddNumbers.get(0);
        for (int number : oddNumbers) {
            if (number > max) {
                max = number;
            }
        }

        // И наконец average
        int sum = 0;
        for (int number : oddNumbers) {
            sum += number;
        }
        double average = (double) sum / oddNumbers.size();

        System.out.println("Odd numbers: " + oddNumbers);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + average);
    }
}

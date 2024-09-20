package Chapter2;

import java.util.Scanner;

public class java1 {

    public static void main(String[] args) {
        String developerName = "Астапов";
        long assignmentReceivedTime = System.currentTimeMillis();
        long assignmentSubmittedTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int minLength = Integer.MAX_VALUE;
        int maxLength = Integer.MIN_VALUE;
        int minLengthNumber = 0;
        int maxLengthNumber = 0;
        for (int number : numbers) {
            int length = String.valueOf(number).length();
            if (length < minLength) {
                minLength = length;
                minLengthNumber = number;
            }
            if (length > maxLength) {
                maxLength = length;
                maxLengthNumber = number;
            }
        }
        System.out.println("Самое короткое число: " + minLengthNumber + ", длина: " + minLength);
        System.out.println("Самое длинное число: " + maxLengthNumber + ", длина: " + maxLength);
    }
}

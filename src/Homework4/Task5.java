package Homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Есть одномерный массив из 10 элементов, заполненный случайными числами. Пользователь вводит с клавиатуры
        // число. Программа показывает есть ли такое число в созданном до этого массиве.

        int[] arr1 = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(-10,50);
        }
        System.out.println(Arrays.toString(arr1));
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean contains = Arrays.toString(arr1).contains(String.valueOf(num));
        System.out.println(contains);

    }
}

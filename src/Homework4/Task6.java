package Homework4;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    //Заполнить массив на 45 элементов случайными числами от -50 до +50. Найти минимальный элемент и вывести его на
    //консоль. Найти максимальный элемент и вывести его на консоль.
    public static void main(String[] args) {
        int[] arr1 = new int[45];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(-50, 50);
        }
        System.out.println(Arrays.toString(arr1));
        int max = arr1[0];
        int min = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            } else if (arr1[i] < min) {
                min = arr1[i];
            }
        }
        System.out.println("Максимум " + max);
        System.out.println("Минимум " + min);


    }
}

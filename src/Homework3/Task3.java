package Homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите число х");
        Scanner x = new Scanner(System.in);
        int num1 = x.nextInt();
        System.out.println("Введите число у");
        Scanner y = new Scanner(System.in);
        int num2 = x.nextInt();

        if (num1>num2){
            System.out.println("Разница чисел составляет - " + (num1-num2));
        }
        else {
            System.out.println("Разница чисел составляет - " + (num2 - num1));
        }

    }
}

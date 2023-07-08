package Homework3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Можно");
        } else {
            System.out.println("Не можно");
        }
    }
}

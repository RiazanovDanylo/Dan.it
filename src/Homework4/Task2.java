package Homework4;

import java.util.Scanner;

public class Task2 {
    // Написать программу в которой пользователь вводит с клавиатуры число, а программа определяет, является она
    // полиндромом или нет. И выводит данную информацию на экран.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(); //вводимое число
        String num2 = ""; // тут должно быть число задом наперед
        int copy = num1; // копия введеного числа для манипуляций
        while (copy != 0){
            num2 += copy%10;
            copy = (copy - (copy%10))/10;
        }
        System.out.println(num2.equals(String.valueOf(num1)));


    }
}

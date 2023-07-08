package Homework3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int num1 = x.nextInt();
        System.out.println("Введите второе число");
        int num2 = x.nextInt();
        System.out.println("Введите действие (* или + или - или / или %");
        String num3 = x.next();

        if (num3.equals("+")){
            System.out.println(num1+num2);
        }
        else if (num3.equals("-")){
            System.out.println(num1-num2);
        }
        else if (num3.equals("/")){
            System.out.println(num1/num2);
        }
        else if (num3.equals("*")){
            System.out.println(num1*num2);
        }
        else if (num3.equals("%")){
            System.out.println(num1%num2);
        }
        else{
            System.out.println(0);
        }

    }
}

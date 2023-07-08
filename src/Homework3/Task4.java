package Homework3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num1 = x.nextInt();

        if (num1==1){
            System.out.println("Понедельник");
        }
        else if (num1==2) {
            System.out.println("Вторник");
        }
        else if (num1==3) {
            System.out.println("Среда");
        }
        else if (num1==4) {
            System.out.println("Четверг");
        }
        else if (num1==5) {
            System.out.println("Пятница");
        }
        else if (num1==6) {
            System.out.println("Суббота");
        }
        else if (num1==7) {
            System.out.println("Воскресенье");
        }
        else {
            System.out.println("Лучше бы сегодня была пятница");
        }


    }
}

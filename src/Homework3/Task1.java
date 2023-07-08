package Homework3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        String str3 = input.next().replace(".", "");
        String str4 = input.next();
        str4 += " " + input.next();
        str4 += " " + input.next();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }
}

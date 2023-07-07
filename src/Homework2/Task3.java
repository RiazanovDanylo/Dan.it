package Homework2;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String str1 = "Completely random text in English. In it, we just need to determine how many times the character " +
                "‘a’ occurs there. And we can use the split method and the length method.";

        String[] arr = str1.toLowerCase().split("a");
        System.out.println(arr.length - 1);

    }
}

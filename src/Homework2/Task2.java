package Homework2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String str1 = "Testing, is my favourite job";
        String[] arr = str1.split(" ");

        String word1 = arr[0];
        word1 = word1.trim().replace(",", "");
        System.out.println("Cлово1 = " + word1 + ", Длина этого слова = " + word1.length());

        String word2 = arr[1];
        word2 = word2.trim().replace(",", "");
        System.out.println("Cлово2 = " + word2 + ", Длина этого слова = " + word2.length());

        String word3 = arr[2];
        word3 = word3.trim().replace(",", "");
        System.out.println("Cлово3 = " + word3 + ", Длина этого слова = " + word3.length());

        String word4 = arr[3];
        word4 = word4.trim().replace(",", "");
        System.out.println("Cлово4 = " + word4 + ", Длина этого слова = " + word4.length());

        String word5 = arr[4];
        word5 = word5.trim().replace(",", "");
        System.out.println("Cлово5 = " + word5 + ", Длина этого слова = " + word5.length());

        boolean length = word1.length() > word2.length() && word1.length() > word3.length() && word1.length() >
                word4.length() && word1.length() > word5.length();

        System.out.println(length);
    }
}

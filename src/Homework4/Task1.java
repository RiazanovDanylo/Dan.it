package Homework4;

import java.util.Scanner;

public class Task1 {
    // Написать программу, которая будет считывать введенные пользователем слова с клавиатуры, и склеивать их в одно
    // предложение до тех пор, пока пользователь не введет с клавитуры слово STOP. Все слова введенные до этого должны
    // отобразится в консоли одним предложением.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        String word;

        while (true) {
            word = scanner.next();
            if (word.equals("STOP")) {
                break;
            }
            result += word + " ";
        }
        System.out.println(result);
    }
}

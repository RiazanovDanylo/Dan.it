package Homework3;

import java.util.Locale;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите программу");
        String programm = scanner.next();

        switch (programm.toUpperCase().trim()) {
            case ("INTELLIJ IDEA"):
                System.out.println("Напишите операционную систему");
                String os1 = scanner.next();
                switch (os1.toUpperCase().trim()) {
                    case ("WINDOWS"):
                        System.out.println("Ссылка на IntelliJ IDEA для Windows");
                        break;
                    case ("LINUX"):
                        System.out.println("Ссылка на IntelliJ IDEA для Linux");
                        break;
                    case ("MACOS"):
                        System.out.println("Ссылка на IntelliJ IDEA для MacOS");
                        break;
                    default:
                        System.out.println("Такой операционной системы нет");
                }
                break;

            case ("JAVA"):
                System.out.println("Напишите операционную систему");
                String os2 = scanner.next();
                switch (os2.toUpperCase().trim()) {
                    case ("WINDOWS"):
                        System.out.println("Ссылка на Java для Windows");
                        break;
                    case ("LINUX"):
                        System.out.println("Ссылка на Java для Linux");
                        break;
                    case ("MACOS"):
                        System.out.println("Ссылка на Java для MacOS");
                        break;
                    default:
                        System.out.println("Такой операционной системы нет");
                }
                break;

            case ("GIT"):
                System.out.println("Напишите операционную систему");
                String os3 = scanner.next();
                switch (os3.toUpperCase().trim()) {
                    case ("WINDOWS"):
                        System.out.println("Ссылка на GIT для Windows");
                        break;
                    case ("LINUX"):
                        System.out.println("Ссылка на GIT для linux");
                        break;
                    case ("MACOS"):
                        System.out.println("Ссылка на GIT для MacOS");
                        break;
                    default:
                        System.out.println("Такой операционной системы нет");
                }
                break;

            default:
                System.out.println("Такой программы нет");
        }
    }
}

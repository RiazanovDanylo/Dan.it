package Homework7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        class Konspekt {

            public static void method(String x, String y, int z, int b, String c, String p) {
                System.out.println("ФИО: " + x);
                System.out.println("Название предмета: " + y);
                System.out.println("Количество страниц: " + z);
                System.out.println("Год выпуска: " + b);
                System.out.println("Цвет обложки: " + c);
                System.out.println("Название заведения, где учится студент: " + p);


            }
        }

        Scanner scanner = new Scanner(System.in);

        String x = scanner.nextLine();
        String y = scanner.nextLine();
        int z = scanner.nextInt();
        int b = scanner.nextInt();
        String c = scanner.nextLine();
        String p = scanner.nextLine();

        Konspekt.method(x, y, z, b, c, p);
    }
}

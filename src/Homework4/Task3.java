package Homework4;

import java.util.Scanner;

public class Task3 {
    // Написать проограмму, условно для склада приема металла. Представим, что склад может хранить определенный вес металла.
    // Пользователь вводит с клавиатуры вес, который может хранится на складе. Дальше пользователь вводит с клавиатуры вес,
    // который условно собирается сдать на склад пользователь. Программа должна после каждой сдачи металла показывать сколько
    // веса еще может принять склад. Если пользователь хочет сдать металла больше чем осталось места на складе, то программа
    // не дает ему это сделать и уведомляет пользователя, о невозможности данной операции. Если пользователь сдает металл
    // весом меньше чем 5, программа тоже предупреждает о невозможности приемки такого малого веса. Программа завершается,
    // когда место на складе закончилось.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько может хранить склад?");
        int maxSize = scanner.nextInt();
        int currentCount = 0;
        int currentSize;
        while (currentCount < maxSize-4) {
            System.out.println("Какой вес вы собираетесь сдать на склад?");
            currentSize = scanner.nextInt();
            if (currentSize < 5) {
                System.out.println("Груз слишком мал");
                continue;
            }
            if (currentSize + currentCount > maxSize) {
                System.out.println("Вы хотите сдать больше металла, чем есть места на складе");
                continue;
            }
            currentCount+=currentSize;
            System.out.println("Осталось место на складе: " + (maxSize-currentCount));
        }
        System.out.println("Места на складе больше нет");
    }
}

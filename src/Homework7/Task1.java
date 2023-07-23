package Homework7;

import java.util.ArrayList;

public class Task1 {
    public class Main {

        //Написать метод, принимающий в качестве параметра массив целых чисел. И выводит на экран все четные числа списком, a
        // также нечетные числа списком.
        public static void main(String[] args) {
            int[] arr = {1,2,0,3,4,5,6,7,8,9,10,12,13,14,12,3,1234,5,346,234,42,6345,53};
            beba(arr);
        }

        private static void beba(int[] arr){
            ArrayList chet = new ArrayList();
            ArrayList neChet = new ArrayList();
            for (int num:arr) {
                if (num%2==0){
                    chet.add(num);
                }
                else {
                    neChet.add(num);
                }

            }
            System.out.println("Четные: " + chet.toString());
            System.out.println("Нечетные: " + neChet.toString());

        }

    }
}

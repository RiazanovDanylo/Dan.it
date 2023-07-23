package Homework7;

public class Task2 {
    public static void main(String[] args) {
        empty();

        empty("Danya");

        String[] terno = {"sdfgdsf", "sdfsdf", "dsfsdfsdf", "jerururururu"};
        empty(terno);

        int[] arr = {1, 2, 4, 3, 2, 2, 3, 4, 5, 32, 2, 7};
        empty(arr);

        empty("some", 4);

    }

    private static void empty() {
        System.out.println("Я пустой");
    }

    private static void empty(String x) {
        System.out.println(x);
    }

    private static void empty(String[] text) {
        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i] + " ");
        }
        System.out.println();
    }

    private static void empty(int[] num) {
        int res = 0;
        for (int i = 0; i < num.length; i++) {
            res += num[i];
        }
        System.out.println(res);
    }

    private static void empty(String x, int y) {
        System.out.println("Ваше сообщение - " + x);
        System.out.println("Ваше число - " + y);

    }
}

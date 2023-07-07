package Homework2;

public class Task1 {
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        int index = string1.indexOf(" it is too long");
        String string2 = string1.substring(0, index);
        String string3 = string2.replace(" i ", " don't ") + " it is perfect.";

        System.out.println(string1 + "\nДлина строки: " + string1.length());
        System.out.println(string2 + "\nДлина строки: " + string2.length());
        System.out.println(string3 + "\nДлина строки: " + string3.length());
    }
}
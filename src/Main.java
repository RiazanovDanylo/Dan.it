public class Main {
    public static void main(String[] args) {
    int a = 7;
    int b = 9;
    a += b;
    b = a - b;
    a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

}
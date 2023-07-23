package Homework6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    static String[][] square = new String[5][5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        for(String[] s : square){
            Arrays.fill(s, "-");
        }
        int x1 = random.nextInt(0, 4);
        int y1 = random.nextInt(0, 4);
        int x,y;

        System.out.println("All Set. Get ready to rumble!");
        while (true) {
            System.out.println("Enter x [1-5]: ");
            x = scanner.nextInt()-1;
            System.out.println("Enter y [1-5]: ");
            y = scanner.nextInt()-1;

            if (x >= 0 && x < 5 && y >= 0 && y < 5) {
                if (x==x1 && y==y1){
                    square[x][y] = "X";
                    System.out.println("You have won! ");
                    printSquare();
                    break;
                }
                System.out.println("Oops... You missed.");
                square[x][y] = "*";
                printSquare();
            }
            else {
                System.out.println("Number out of range");
            }


        }


    }

    private static void printSquare() {
        String[][] arr = new String[6][6];
        arr[0] = new String[]{"0", "1", "2", "3", "4", "5"};
        for(int i = 1; i < arr.length; i++){
            arr[i][0] = String.valueOf(i);
            System.arraycopy(square[i - 1], 0, arr[i], 1, square.length);
        }

        for(String[] s : arr){
            System.out.println(Arrays.toString(s));
        }
        }
    }

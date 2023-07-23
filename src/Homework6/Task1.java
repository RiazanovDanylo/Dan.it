package Homework6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int row;
        int col;
        Random random = new Random();
        row = scanner.nextInt(); // 2
        col = scanner.nextInt(); // 3
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = random.nextInt(1001);
            }
        }
        int[] maxValues = new int[row];
        for (int i = 0; i < row; i++) {
            int max = array[i][0];
            for (int j = 1; j < col; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            maxValues[i] = max;
        }


        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.toString(maxValues));
    }
}

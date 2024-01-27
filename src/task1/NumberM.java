package task1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class NumberM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number 1");
        int x = scanner.nextInt();
        System.out.println("Insert number 2");
        int y = scanner.nextInt();
        int[][] array = new int[x][y];
        Random random = new Random();
        int[] arrayResult = new int[x];

        for (int i = 0; i < x; i++) {
            int max = array[i][0];
            for (int j = 0; j < y; j++) {
                array[i][j] = random.nextInt(1, 1000);
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
            arrayResult[i] = max;
        }
        System.out.println("Array of max numbers");
        System.out.println(Arrays.toString(arrayResult));

    }
}


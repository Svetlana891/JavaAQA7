
package task2;

import java.util.Scanner;
import java.util.Random;

public class GameV2 {
    public static void main(String[] args) {
        String[][] numbers = new String[6][6];
        for (int i = 0; i < 6; i++) {
            numbers[i][0] = "" + i;
            for (int j = 1; j < 6; j++) {
                numbers[0][j] = "" + j;
                numbers[i][j] = "-";
            }
        }

        Random random = new Random();

        int x = random.nextInt(1, 5);
        int y = random.nextInt(1, 5);
        System.out.println("All set.Get ready to rumble!");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println();

            System.out.println("Insert number 1");
            int a = scanner.nextInt();
            if(a > 5){
                System.out.println("Number should in range 1-5");
                continue;
            }
            if(a < 1){
                System.out.println("Number should in range 1-5");
                continue;
            }
            System.out.println();
            System.out.println("Insert number 2");
            int b = scanner.nextInt();
            if(b > 5){
                System.out.println("Number should in range 1-5");
                continue;
            }
            if(b < 1){
                System.out.println("Number should in range 1-5");
                continue;
            }

            if (x == a && y == b) {
                numbers[a][b] = "x";
                for (int i = 0; i < 6; i++) {
                    System.out.println();
                    for (int j = 0; j < 6; j++) {
                        System.out.print(numbers[i][j] + "     ");
                    }
                }
                System.out.println("You have won!");
                break;
            } else {
                numbers[a][b] = "*";
                for (int i = 0; i < 6; i++) {
                    System.out.println();
                    for (int j = 0; j < 6; j++) {
                        System.out.print(numbers[i][j] + "     ");
                    }
                }
            }
        }
    }
}






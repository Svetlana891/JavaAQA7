package task22;

import java.util.Random;
import java.util.Scanner;

public class ArrayForMath {


    public double returnDouble(int[] arrayInt){



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int i = scanner.nextInt();
        double d = arrayInt[i] / arrayInt[0];
        return d;
    }


    public static void main(String[] args) {
        task2.ArrayForMath array = new task2.ArrayForMath();

        Random random = new Random();
        int x = random.nextInt(1, 30);

        int [] arrayInt = new int[x];
        for( int i = 0; i < x; i++){
            arrayInt[i] = random.nextInt(0, 30);
            System.out.print(arrayInt[i] + " ");
        }

        System.out.println();
        System.out.println(array.returnDouble(arrayInt));



    }

}


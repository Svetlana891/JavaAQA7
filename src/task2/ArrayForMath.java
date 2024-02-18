package task2;

import java.util.Random;
import java.util.Scanner;

public class ArrayForMath {

    public double returnDouble(int[] arrayInt) throws DivisionException{

        Random random= new Random();
        int x = random.nextInt(1, 30);
        int[] arrayInteger = new int[x];
        for(int i = 0; i < x; i++){
            arrayInteger[i] = random.nextInt(0, 30);
            System.out.println(arrayInteger[i] + " ");
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int i = scanner.nextInt();
        double d = arrayInteger[i] / arrayInteger[0];
        if (arrayInteger[0] == 0) {
            throw new DivisionException();
        } else {
            return d;
        }
    }






//    public static void main(String[] args) {
//        ArrayForMath array = new ArrayForMath();

//        Random random= new Random();
//        int x = random.nextInt(1, 30);
//        int[] arrayInt = new int[x];
//        for(int i = 0; i < x; i++){
//            arrayInt[i] = random.nextInt(0, 30);
//            System.out.println(arrayInt[i] + " ");
//        }

//        System.out.println(array.returnDouble(arrayInt));

//    }





}

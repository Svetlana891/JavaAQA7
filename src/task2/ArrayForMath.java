package task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayForMath {

    public double returnDouble() throws ExitOnBoundArrayException,
            DivisionNullOnNumberException {

        Random random= new Random();
        int sizeArray = random.nextInt(1, 30);
        int[] arrayInteger = new int[sizeArray];
        for(int i = 0; i < sizeArray; i++){
            arrayInteger[i] = random.nextInt(0, 30);
        }
        System.out.println(Arrays.toString(arrayInteger));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int indexArray = scanner.nextInt();
        double result;
        try {
             result = arrayInteger[indexArray] / arrayInteger[0];
        } catch (ArrayIndexOutOfBoundsException e){
            throw new ExitOnBoundArrayException();
        } catch (ArithmeticException e) {
            throw new DivisionNullOnNumberException();
        }

            return result;
        }
    }










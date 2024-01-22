import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Random randomObject = new Random();


        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomObject.nextInt(0, 50);
        }

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(Arrays.toString(randomArray));

        for ( int i = 0; i < randomArray.length; i++ ) {
            System.out.println(randomArray[i] == number);
        }


    }
}

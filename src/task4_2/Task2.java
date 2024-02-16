package task4_2;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numberN = Integer.toString(number);

        for( int i = 0; i < numberN.length(); i++){
            if(numberN.charAt(i) == numberN.charAt(numberN.length() - 1 - i++)){
                System.out.println("Два числа равны");
            }
        }
        System.out.println("Это полиндром");

    }
}
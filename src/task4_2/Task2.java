package task4_2;

import java.util.Scanner;
public class Task2 {
/*
    Написать программу в которой пользователь вводит с клавиатуры число, а программа определяет, является
    она полиндоомом или нет. И выводит данную информацию на экран.
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numberN = Integer.toString(number);

        boolean isPolindrom = true;
        for(int i = 0; i < numberN.length() / 2; i++){
            if(numberN.charAt(i) != numberN.charAt(numberN.length() - 1 - i)){
                System.out.println("Это не полиндром");
                isPolindrom = false;
                break;
            }
        }
        if(isPolindrom == true) {
            System.out.println("Это полиндром");
        }

    }
}
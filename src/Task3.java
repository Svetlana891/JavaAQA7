import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner textHelper = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = textHelper.nextInt();
        System.out.println("Введите второе число");
        int number2 = textHelper.nextInt();

        int result1 = number1 - number2;
        int result2 = number2 - number1;
//        System.out.println(result1);
//        System.out.println(result2);
        int result3 = 0;
        int result;
        result = number1 > number2 ? result1 : number2 > number1 ? result2 : result3;
        System.out.println(result);


    }
}

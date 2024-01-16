import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Введите один из символов: + - % / *");
        String symbol = scanner.next();

        int result1;
        int result2;
        int result3;
        int result4;
        int result5;
        int result6;
        int result;

        result1 = a - b;
        result2 = a + b;
        result3 = a % b;
        result4 = a / b;
        result5 = a * b;
        result6 = 0;

        result = symbol.equals("-") ? result1 : symbol.equals("+") ? result2 : symbol.equals("%") ? result3 : symbol.equals("/") ? result4 : symbol.equals("*") ? result5 : result6;
        System.out.println(result);
    }
}

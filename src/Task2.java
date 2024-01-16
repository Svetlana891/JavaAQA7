
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner textHelper = new Scanner(System.in);
        System.out.println("Введите первое целочисельное значение");
        int a = textHelper.nextInt();
//        System.out.println(a);

        System.out.println("Введите второе целочисельное значение");
        int b = textHelper.nextInt();
//        System.out.println(b);

        System.out.println("Введите третье целочисельное значение");
        int c = textHelper.nextInt();
//        System.out.println(c);

        if ( a + b > c ) {
            System.out.println("Первое условие выполнено");
        } if ( a + c > b ) {
            System.out.println("Второе условие выполнено");
        } if ( b + c > a ) {
            System.out.println("Третье условие выполнено");
            System.out.println("Треугольник построить возможно");
        } else {
            System.out.println("Треугольник построить невозможно");
                    }

    }
}

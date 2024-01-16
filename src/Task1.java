
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner textHelper = new Scanner(System.in);
        System.out.println("Я тестирую замечательно. Что еще нужно?");
        String string1 = textHelper.next();
        System.out.println(string1);
        String string2 = textHelper.next();
        System.out.println(string2);
        String string3 = textHelper.next();
        System.out.println(string3);
        String string4 = textHelper.next() + " " + textHelper.next() + " " + textHelper.next();
        System.out.println(string4);

    }
}


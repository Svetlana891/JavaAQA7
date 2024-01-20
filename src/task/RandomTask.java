package task;
import java.util.Scanner;
import java.util.Random;
public class RandomTask {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scanner.next();
        System.out.println("Let the game begin!");
        System.out.println("Введите ваше число");

        int number = scanner.nextInt();

        int[] numbers = new int[number + 1];
        for(int i = 0; i < numbers.length; i++ ){
            numbers[i] = random.nextInt(0, 100);
            int x = numbers[i];
            while (number != x){
                if(number < x){
                    System.out.println("You number is too small. Pleas, try again...");
                    number = scanner.nextInt();
                }
                if(number > x){
                    System.out.println("You number is too big. Pleas, try again...");
                    number = scanner.nextInt();
                }
                if(number == x){
                    System.out.println("Congratulations, " + name + " !");
                }
            }
        }

    }
}

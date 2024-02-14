package task;
import java.util.Scanner;
import java.util.Random;
public class RandomTask {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(0, 100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("Let the game begin!");
        System.out.println("Enter your number");

        int number = scanner.nextInt();

            while (true){
                if(number < target){
                    System.out.println("You number is too small. Pleas, try again...");
                    number = scanner.nextInt();
                } else if(number > target){
                    System.out.println("You number is too big. Pleas, try again...");
                    number = scanner.nextInt();
                } else {
                    System.out.println("Congratulations, " + name + "!");
                    break;
                }
            }

    }
}

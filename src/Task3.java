import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите максимальный вес метела который может хранится на складе");
        int weightM = scanner.nextInt();
        System.out.println("Введите вес метала который собираетесь сдать");
        int weight = scanner.nextInt();

        while (weight != weightM) {
            if (weight < 5) {
                System.out.println("Склад не может принять метал весом до 5");
                break;
            }
            System.out.println("Вы можете сдать еще " + (weightM - weight));
            int weightN = scanner.nextInt();
            if (weight + weightN > weightM) {
                System.out.println("Вы привысили максимальный вес метала");
                break;
            }
            if (weight + weightN != weightM) {
                System.out.println("Вам нужно здать еще " + (weightM - (weight + weightN)));
                continue;
            }
            if (weight + weightN == weightM) {
                System.out.println("Вы здали максимальное количество метала");
            }
        }

    }
}



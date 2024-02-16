package task4_3;

import java.util.Scanner;
public class Task3 {

    /*
    Написать программу, условно для склада приема металла. Представим, что склад может хранить определенный вес металла.
    Пользователь вводит с клавиатуры вес, который может хранится на складе.
    Дальше пользователь вводит с клавиатуры вес, который условно собирается сдать на склад пользователь.
    Программа должна после каждой сдачи металла показывать сколько веса еще может принять склад. Если пользователь хочет
    сдать металла больше чем осталось места на складе, то программа не дает ему это сделать и уведомляет пользователя,
    о невозможности данной операции. Если пользователь сдает металл весом меньше чем 5, программа тоже предупреждает о
    невозможности приемки такого малого веса.
    Прогоамма завершается, когда место на складе закончилось.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите максимальный вес метела который может хранится на складе");
        int weightMax = scanner.nextInt();
        int weight = 0;

        while (weight != weightMax) {
            System.out.println("Введите вес метала который собираетесь сдать");
            int weightN = scanner.nextInt();
            if (weightN < 5) {
                System.out.println("Склад не может принять метал весом до 5");
                continue;
            }
            if (weight + weightN > weightMax) {
                System.out.println("Вы привысили максимальный вес метала");
                continue;
            }
            if (weight + weightN != weightMax) {
                weight = weight + weightN;
                System.out.println("Вы можете здать еще: " + (weightMax - weight));
                continue;
            }
            if (weight + weightN == weightMax) {
                System.out.println("Вы здали максимальное количество метала");
                break;
            }
        }


    }
}
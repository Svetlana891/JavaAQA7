package task4_1;


import java.util.Arrays;
        import java.util.Scanner;
        import java.util.Random;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше слово");
        String word = scanner.next();
        Random random = new Random();
        int x = random.nextInt(10, 100);

        String[] words = new String[x];
        for (int i = 0; i < words.length; i++) {
            words[i] = word;
            System.out.print(words[i]);
            word = scanner.next();
            if (word.equals("STOP")) {
                System.out.println(Arrays.toString(words));
            }
        }


    }
}
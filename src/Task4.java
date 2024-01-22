import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        System.out.println("Введите третье число");
        int number3 = scanner.nextInt();

        String[] arrayString = new String[7];
        arrayString[0] = "Петя";
        arrayString[1] = "Маша";
        arrayString[2] = "Алена";
        arrayString[3] = "Федя";
        arrayString[4] = "Саша";
        arrayString[5] = "Антон";
        arrayString[6] = "Глеб";

        for(int i = 0; i < arrayString.length; i++) {
            if(number1 == i){
                System.out.print(arrayString[i] + " будет идти в ");
            }
        }

        String[] arrayStringS = new String[6];
        arrayStringS[0] = "школу";
        arrayStringS[1] = "магазин";
        arrayStringS[2] = "церковь";
        arrayStringS[3] = "тренажерный зал";
        arrayStringS[4] = "кино";
        arrayStringS[5] = "поликлинику";

        for(int i = 0; i < arrayStringS.length; i++) {
            if(number3 == i){
                System.out.print(arrayStringS[i]);
            }
        }

        int[] arrayInt = new int[6];
        arrayInt[0] = 10;
        arrayInt[1] = 12;
        arrayInt[2] = 14;
        arrayInt[3] = 16;
        arrayInt[4] = 18;
        arrayInt[5] = 20;

        for(int i = 0; i < arrayInt.length; i++) {
            if(number2 == i){
                System.out.print(" в " + arrayInt[i] + ":00");
            }
        }
    }
}

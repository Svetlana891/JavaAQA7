import java.util.Random;
public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[45];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(-50, 50);
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");
        int numberMin = numbers[44];
        int numberMax = numberMin;
        for(int i = 0; i < numbers.length; i++) {
            if(numberMin > numbers[i]){
                numberMin = numbers[i];
            }
            if(numberMax < numbers[i]){
                numberMax = numbers[i];
            }
        }
        System.out.println(numberMin);
        System.out.println(numberMax);

    }
}

package task1;

public class Numbers {
    public void evenOddNumbers(int[] array) {
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                System.out.println(array[i] + " even number");
            }
        }
        System.out.println();
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 1){
                System.out.println(array[i] + " odd number");
            }
        }
    }


    public static void main(String[] args) {
        Numbers example = new Numbers();
        example.evenOddNumbers(new int[]{4, 3, 7, 8});
    }

}
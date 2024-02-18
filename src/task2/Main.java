package task2;

public class Main {
    public static void main(String[] args) {
        ArrayForMath arrayForMath = new ArrayForMath();
        try {
            arrayForMath.returnDouble();
        }catch (DivisionException e){
            System.out.println(e.getMessage());
        }
        System.out.println("check");
    }
}

package task2;

public class Main {
    public static void main(String[] args) {
        ArrayForMath arrayForMath = new ArrayForMath();
        double result;

        try {
            result = arrayForMath.returnDouble();
            System.out.println("Result: " + result);
        } catch (ExitOnBoundArrayException e) {
            System.out.println(e.getMessage());
        } catch (DivisionNullOnNumberException e) {
            System.out.println(e.getMessage());
        }





    }
}

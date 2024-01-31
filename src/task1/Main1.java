package task1;

public class Main1 {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Asus", 1000, 20, 30);
        System.out.println(computer1);

        Computer computer2 = new Computer("Asus", 2000, 20, 30);
        System.out.println(computer1.equals(computer2));



    }
}

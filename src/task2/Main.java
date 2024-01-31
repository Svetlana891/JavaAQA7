package task2;

public class Main {
    public static void main(String[] args) {
        Tree stick1 = new Tree("oak", 200);
        stick1.getInfo();
        System.out.println();

        Tree stick2 = new Tree(100, 18, "red");
        stick2.getInfo();
        System.out.println();

        Tree stick3 = new Tree();
        stick3.type = "birch";
        stick3.getInfo();
        System.out.println();

//        Tree stick4 = new Tree("maple", )


    }
}

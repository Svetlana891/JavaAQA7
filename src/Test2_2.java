public class Test2_2 {
    public static void main(String[] args) {
        String forSplit = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there";
        forSplit = forSplit.toLowerCase();
        String[] arrayOfString = forSplit.split("a");
        int size = arrayOfString.length - 1;
        System.out.println("Cимвол 'а' встречается в строке: " + size + " раз.");

    }
}

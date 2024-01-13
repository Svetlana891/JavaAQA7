public class Test2_1 {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";
        String[] strings = string.split(" ");
        String word1 = strings[0];
        String word2 = strings[1];
        String word3 = strings[2];
        String word4 = strings[3];
        String word5 = strings[4];

        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word3.length();
        int length4 = word4.length();
        int length5 = word5.length();

        System.out.println(word1 + " = " + length1);
        System.out.println(word2 + " = " + length2);
        System.out.println(word3 + " = " + length3);
        System.out.println(word4 + " = " + length4);
        System.out.println(word5 + " = " + length5);

        boolean word1Longer = length1>length2 && length1>length3 && length1>length4 && length1>length5;
        System.out.println(word1Longer);
    }
}

public class Test2 {
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        String string2;
        string2 = string1.substring(0, string1.length()-14);
        int length = string2.length();
        System.out.println(string2 + "= " + length);
        String string3;
        string3 = string2.replace("i want", "don't want").concat("it is perfect");
        int length1 = string3.length();
        System.out.println(string3 + " = " + length1);

    }
}

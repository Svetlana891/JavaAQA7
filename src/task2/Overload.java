package task2;

public class Overload {
    public void toSend(){
        System.out.println("Я пустой");
    }
    public void toSend(String text){
        System.out.println(text);
    }
    public void toSend(String[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public void toSend(int[] arrayNum){
        int sum = 0;
        for(int i = 0; i < arrayNum.length; i++){
            sum = sum + arrayNum[i];
        }
        System.out.println(sum);
    }
    public void toSend(int number ,String text){
        System.out.println("Ваше сообщение - " + text + " " + "Ваше число - " + number);

    }

    public static void main(String[] args) {
        Overload message = new Overload();
        message.toSend();
        message.toSend("Я пустой");
        message.toSend(new String[]{"photo", "picture", "letter"});
        message.toSend(new int[]{4, 6, 5, 3});
        message.toSend(3,"I want to send letter");
    }
}

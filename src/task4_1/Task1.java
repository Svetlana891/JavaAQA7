package task4_1;

import java.util.Scanner;

public class Task1 {
    /*
    Написать программу, которая будет считывать введенные пользователем слова с клавиатуры слова, и склеивать их в одно
    предложение до тех пор, пока пользователь не введет с клавитуры слово STOP. Bce слова введенные до этого должны
    отобразится в консоли одним предложением.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";

        while (true){
            System.out.println("Введите ваше слово");
            String word = scanner.next();

            if(word.equals("STOP")){
                break;
            }
            text = text + word + " ";
            System.out.println(text);


        }


    }
}
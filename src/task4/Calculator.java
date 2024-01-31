package task4;

import java.util.Scanner;

public class Calculator {
    public void start(){
        System.out.println("Calculator is running");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter first number");
            double number1 = scanner.nextDouble();
            System.out.println("Select sign");
            String symbol = scanner.next();
            if(!symbol.equals("+") && !symbol.equals("-") && !symbol.equals("*") && !symbol.equals("/")){
                System.out.println("Enter the correct action");
                continue;
            }
            System.out.println("Select second number");
            double number2 = scanner.nextDouble();

            if(symbol.equals("+")){
                summ(number1, number2);
            }
            if(symbol.equals("-")){
                minus(number1, number2);
            }
            if(symbol.equals("*")){
                multiply(number1, number2);
            }
            if(symbol.equals("/")){
                division(number1, number2);
            }
            String word = scanner.next();
            if(word.equals("STOP")){
                System.out.println("The calculator is closed");
                break;
            }

        }
    }

    public double summ(double number1, double number2){
        double result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " +  result);
        System.out.println("Enter action");
        System.out.println("If you want to stop enter the STOP command");
        return result;
    }

    public double minus(double number1, double number2){
        double result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        System.out.println("Enter action");
        System.out.println("If you want to stop enter the STOP command");
        return result;
    }

    public double multiply(double number1, double number2){
        double result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        System.out.println("Enter action");
        System.out.println("If you want to stop enter the STOP command");
        return result;
    }

    public double division(double number1, double number2){
        double result = number1 / number2;
        System.out.println(+ number1 + " / " + number2 + " = " +  result);
        System.out.println("Enter action");
        System.out.println("If you want to stop enter the STOP command");
        return result;
    }


}

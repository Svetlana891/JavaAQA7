package task3;

public class Converter {
    private String name;

    public Converter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int convertToInt(byte value){
        int result = (int) value;
        return result;
    }

    public int convertToInt(short value) {
        int result = (int) value;
        return result;
    }

    public int convertToInt(long value) {
        int result = (int) value;
        return result;
    }

    public int convertToInt(float value){
        int result = (int) value;
        return result;
    }

    public int convertToInt(double value){
        int result = (int) value;
        return result;
    }

    public int convertToInt(String value){
        int result = Integer.parseInt(value);
        return result;
    }

    public int convertToInt(char value){
        int result = (int) value - '0';
        return result;
    }

    public double convertToDouble(byte value){
        double result = (double) value;
        return result;
    }

    public double convertToDouble(short value){
        double result = (double) value;
        return result;
    }

    public double convertToDouble(int value){
        double result = (double) value;
        return result;
    }

    public double convertToDouble(long value){
        double result = (double) value;
        return result;
    }

    public double convertToDouble(float value){
        double result = (double) value;
        return result;
    }

    public double convertToDouble(char value){
        double result = (double) value - '0';
        return result;
    }

    public double convertToDouble(String value){
        double result = Double.parseDouble(value);
        return result;
    }

    public String convertToString(byte value){
        String result = String.valueOf(value);
        return result;
    }

    public String convertToString(short value){
        String result = String.valueOf(value);
        return result;
    }
    public String convertToString(int value){
        String result = String.valueOf(value);
        return result;
    }

    public String convertToString(long value){
        String result = String.valueOf(value);
        return result;
    }

    public String convertToString(char value){
        String result = String.valueOf(value);
        return result;
    }

    public String convertToString(float value){
        String result = String.valueOf(value);
        return result;
    }

    public String convertToString(double value){
        String result = String.valueOf(value);
        return result;
    }

    public String convertToString(boolean value){
        String result = String.valueOf(value);
        return result;
    }


    public void convertToDouble(boolean value){
        System.out.println("Введен тип boolean");
    }

    public void convertToInt(boolean value){
        System.out.println("Введен тип boolean");
    }


}






package task3;

public class TestConverter {
    public static void main(String[] args) {
        Converter converter = new Converter("My converter");

        byte valueByte = 124;
        System.out.println(converter.convertToInt(valueByte));

        short valueShort = 589;
        System.out.println(converter.convertToInt(valueShort));

        long valueLong = 677555;
        System.out.println(converter.convertToInt(valueLong));

        float valueFloat = 55.67f;
        System.out.println(converter.convertToInt(valueFloat));

        double valueDouble = 3887.7;
        System.out.println(converter.convertToInt(valueDouble));

        char valueChar = '9';
        System.out.println(converter.convertToInt(valueChar));

        String valueString = "5";
        System.out.println(converter.convertToInt(valueString));


        byte valueByte1 = 99;
        System.out.println(converter.convertToDouble(valueByte1));

        short valueShort1 = 1199;
        System.out.println(converter.convertToDouble(valueShort1));

        int valueInt1 = 12999;
        System.out.println(converter.convertToDouble(valueInt1));

        long valueLong1 = 1295599;
        System.out.println(converter.convertToDouble(valueLong1));

        float valueFloat1 = 24.7f;
        System.out.println(converter.convertToDouble(valueFloat1));

        char valueChar1 = '6';
        System.out.println(converter.convertToDouble(valueChar1));

        String valueString1 = "566.777";
        System.out.println(converter.convertToDouble(valueString1));


        byte valueByte2 = 95;
        System.out.println(converter.convertToString(valueByte2));

        short valueShort2 = 959;
        System.out.println(converter.convertToString(valueShort2));

        int valueInt2 = 788;
        System.out.println(converter.convertToString(valueInt2));

        long valueLong2 = 129559;
        System.out.println(converter.convertToString(valueLong2));

        char valueChar2 = '4';
        System.out.println(converter.convertToString(valueChar2));

        float valueFloat2 = 98.8f;
        System.out.println(converter.convertToString(valueFloat2));

        double valueDouble2 = 7798.97;
        System.out.println(converter.convertToString(valueDouble2));

        boolean valueBoolean2 = true;
        System.out.println(converter.convertToString(valueBoolean2));


        boolean valueBoolean1 = true;
        converter.convertToInt(true);

        boolean valueBoolean = false;
        converter.convertToDouble(false);






        int valueInt = 48;
        System.out.println(converter.convertToString(valueInt));

        if("48".equals( converter.convertToString(48))) {
            System.out.println("Successfully");
        } else {
            System.out.println("Test failed");
        }




    }
}

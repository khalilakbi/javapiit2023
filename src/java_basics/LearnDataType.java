package java_basics;

public class LearnDataType {
    public static void main(String[] args) {
        int a; // variable declaration
        int b = 10;// variable declaration and initialize to 10

        //Primitive  data type

        byte myByte = 12; //Stores  numbers from -128 to 127
        System.out.println(myByte);
        short myShort = 32767;//Stores  numbers from -32,768 to 32,767
        System.out.println(myShort);
        int myInt = 2147483647; //Stores  numbers from -2,147,483,648 to 2,147,483,647
        System.out.println(myInt);
        long myLong = -9223372036854775808L;//Stores  numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.println(myLong);
        float myFloat = 12.67f;//Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        System.out.println(myFloat);
        double myDouble = 123.567;//Stores fractional numbers. Sufficient for storing 15 decimal digits
        System.out.println(myDouble);
        boolean isTrue = true;//Stores true or false values
        System.out.println(isTrue);
        char myChar = 'a';//Stores a single character
        System.out.println(myChar);

        //non-primitive types are Strings, Arrays, Classes, Interface (refer to object and class)

    }
}

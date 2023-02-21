package learn_exceptions;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("please enter the first number ");
//        int a = sc.nextInt();
//        System.out.println("please enter the second number");
//        int b = sc.nextInt();
//        try {
//            System.out.println(a / b);
//        }catch (ArithmeticException ex){
//            System.out.println("sorry b can't be zero");
//        }
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException ex) {
            str = "malek";
            System.out.println(str.length());
        }catch (RuntimeException ex){
            System.out.println("unknown exception");
        }





    }
}

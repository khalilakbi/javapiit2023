package learn_exceptions;

import java.util.Scanner;

public class LearnFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the first number ");
        int a = sc.nextInt();
        System.out.println("please enter the second number");
        int b = sc.nextInt();
        System.out.println("we start");
        try{
            System.out.println(a / b);
        }catch (NullPointerException ex){
            System.out.println("we have exception");
        }finally{
            System.out.println("we are done");
        }
        System.out.println("this is the last to do");


    }


}

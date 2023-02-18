package learn_exceptions;

import java.util.Scanner;

public class LearnThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your age");
        int age = sc.nextInt();
        if (age < 18) {
            throw new RuntimeException("you not authorize to work");
        }

        System.out.println("welcome to our companny");
    }
}

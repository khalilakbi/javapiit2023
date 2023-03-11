package java_basics.control_statement;

import java.util.HashMap;
import java.util.HashSet;

public class ForLoop {
    public static void main(String[] args) {
        /*
        for(initialization, condition, increment/decrement){
              //block of statements
          }
         */
        HashMap map = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i+" ");
        }


    }
}

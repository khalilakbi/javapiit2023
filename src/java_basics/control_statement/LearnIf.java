package java_basics.control_statement;

public class LearnIf {
    public static void main(String[] args) {
        int age = 19;
        //if statement tests the condition. It executes the if block if condition is true.
        if (age > 18) {
            System.out.println("age is greater than 18");
        }

        int a = 13;
        // if-else statement also tests the condition. It executes the if block if condition is true
        // otherwise else block is executed.
        if (a % 2 == 0) {
            System.out.println(a + "is even number");
        } else {
            System.out.println(a + " is odd number");
        }

        int b = -3;
        //if-else-if  statement executes one condition from multiple statements.
        if (b > 0) {
            System.out.println("positive number");
        } else if (b < 0) {
            System.out.println("negative number");
        } else {
            System.out.println("Zero");
        }
    }
}

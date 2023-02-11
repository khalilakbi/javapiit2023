package java_basics.control_statement;

public class LearnWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        int a = 0;
        int b = 10;
        do {
            System.out.println(a + " is less than " + b);
            a++;
        } while (a < b);


    }
}

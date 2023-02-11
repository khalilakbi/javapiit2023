package java_basics.java_operators;

public class LearnArithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println(sum);

        int sub = a - b;
        System.out.println(sub);

        int modulus = a % b;
        System.out.println(modulus);

        int mul = a * b;
        System.out.println(mul);

        float div = a / b;
        System.out.println(div);

        a++;
        System.out.println("increment a "+a);

        b--;
        System.out.println("decrement b "+b);
    }
}

package java_basics.java_operators;

public class LeanAssignment {
    public static void main(String[] args) {
        int a = 13;
        int b = a; // assign a to b ,b = 13;
        System.out.println(b);

        a += 10; // a = a + 10, a = 23;
        System.out.println(a);

        b -= 20;// b = b -20; 13 - 20 = -7;
        System.out.println(b);

        int c = 100;
        c /= 10; // c = 100 / 10 = 10;
        System.out.println(c);

        c *= 5; //c = 10 * 5 = 50;
        System.out.println(c);

        c %=13;//c = c % 13 = 11; 50 / 13 = 39 remainder is 11
        System.out.println(c);
    }
}

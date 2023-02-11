package java_basics.java_operators;

public class LearnComparison {
    public static void main(String[] args) {
        int a = 100;
        int b = 13;

        // comparison operator return a boolean
        boolean isGreater = a > b; // true a is greater than b
        System.out.println(isGreater);

        boolean isLess = a < b; // false a is not less than b
        System.out.println(isLess);

        int x = 10;
        int y = 10;

        boolean areEqual = x == y;
        System.out.println(areEqual);

        boolean areNotEqual = x != y;
        System.out.println(areNotEqual);

        System.out.println(x >= y); // return true x == y
        System.out.println(x <= y);

        // instanceof (refer to object)
        LearnComparison learnComparison = new LearnComparison();
        System.out.println(learnComparison instanceof LearnComparison);

    }
}

package java_basics.java_static;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        factorial.countFactorial(5);

        int factNum = factorial.countFactorial1(4);
        System.out.println(factNum);
    }

    public void countFactorial(int number){
        int fact = 1;
        for(int i = 1; i <= number; i ++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
    public int countFactorial1(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }
}

package groups_exercices;

public class SumOfDigit {
    public static void main(String[] args) {
        //10. Write a Java program to calculate the sum of digits of a number using while loop.

//        int num = 1234; // 1 + 2 + 3 + 4
//        int sum = 0;
//
//        // num % 10 digit  nun / 10
//
//        while(num > 0){
//            sum = sum + (num % 10);
//            num = num / 10;
//        }
//        System.out.println(sum);

        countSumDigit(12);
    }
    public static void countSumDigit(int num){
        int sum = 0;

        while(num > 0){
            sum = sum + (num % 10);
            num = num / 10;
        }
        System.out.println(sum);
    }
}

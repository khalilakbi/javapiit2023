package groups_exercices;

public class SumOfDigit {
    public static void main(String[] args) {
        //10. Write a Java program to calculate the sum of digits of a number using while loop.
        int num = 123456;
        int count = 0;
        while(num > 0){
            count ++;
            num = num / 10;
        }
        System.out.println(count);

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

        while(num > 0){ // 3456  // 6  345 // 11 34 // 15  3 //18
            sum = sum + (num % 10);
            num = num / 10;
        }
        System.out.println(sum);
    }
}

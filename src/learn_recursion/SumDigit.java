package learn_recursion;

public class SumDigit {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }

    public static int sumOfDigit(int num) { // 12345   //1234 + 5  //9 + sumde(123)  // sumd(12) + 12
        if (num == 0) {// base case
            return 0;
        }
        return sumOfDigit(num / 10) + num % 10;
    }

    public static boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }

    public static int sumNumber(int num) {

        if (num == 0) { //10  sum(9) + 10 / sum(8) + 19
            return 0;
        }
        return sumNumber(num - 1) + num;
    }

    //    public static int sumArray(int []a, int n){ // n length a
//        int sum = 0;
//        for(int i = 0; i < n; i ++){
//            sum = sum + a[i];
//        }
//        return sum;
//    }
    public static int sumArray(int[] a, int n) {
        if (n == 0) {
            return 0;
        }
        return sumArray(a, n - 1) + a[n - 1];
    }

}

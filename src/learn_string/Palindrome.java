package learn_string;

public class Palindrome {
    public static void main(String[] args) {
//        String str = "madam";
//        String rev = "";
//
//        for (int i = str.length()-1; i >= 0; i --){  //a , ab , abba // cba
//            rev = rev + str.charAt(i);
//        }
//        for(int i = 0; i < str.length(); i ++){ //a , ba ,cba
//            rev = str.charAt(i) + rev;
//        }
//        System.out.println(str.equals(rev));
        System.out.println(isPalindrome("malek"));


    }
    public  static boolean isPalindrome(String str){
        String rev = "";
        for(int i = 0; i < str.length(); i ++){ //a , ba ,cba
            rev = str.charAt(i) + rev;
        }
        return str.equals(rev);
    }
}

package learn_string;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
//        String str = "Malek";// literal declaration will be store in String constant pool
//        str = str.concat(" saci");// same as +
//        System.out.println(str);
//        int l = str.length();
//        System.out.println(l);
//        int index = str.indexOf("c");
//        System.out.println(index);
//        str = str.toLowerCase();
//        System.out.println(str);
//        str = str.toUpperCase();
//        System.out.println(str);
//        boolean isEqual = str.equals("malek saci");// same as ==
//        System.out.println(isEqual);
//        boolean isEqual2 = str.equalsIgnoreCase("malek saci");
//        System.out.println(isEqual2);
//        String str1 = "java is a programing language";
//        String [] word = str1.split(" ");
//        System.out.println(Arrays.toString(word));
//        // StringBuilder are mutable
//        StringBuilder s = new StringBuilder("khalil");
//        s.append(" akbi");
//        System.out.println(s);
//        StringBuilder s = new StringBuilder(str);
//        System.out.println(s);
//        s.append("  arup");
//        System.out.println(s);
//        String str = "munna";
//        System.out.println(str.charAt(1));
        System.out.println(reverse("munna"));
        StringBuilder s = new StringBuilder("malek");
        System.out.println(s.reverse());

    }
    static String reverse(String str){
        String rev = "";
        for(int i = 0; i < str.length(); i ++){  // 1iteration m + "" = m ; 2 iteration u + m = um ;iteration n + um = num
             rev = str.charAt(i) + rev;
        }
        return rev;
    }
    static void printReverse(String str){
        String rev = "";
        for(int i = 0; i < str.length(); i ++){ // m + "" = m; am ; lam ; elam ; kelam
            rev = str.charAt(i) + rev;
        }
        System.out.println(rev);
    }

}

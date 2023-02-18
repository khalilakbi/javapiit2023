package learn_conversion;

public class Conversion {
    public static void main(String[] args) {
        String str = "100$";
        int a;

        try{
            a = Integer.parseInt(str);
        }catch (NumberFormatException ex){
            str = str.substring(0,3);
            a = Integer.parseInt(str);
        }
        System.out.println(a);
        int b = 12345;
        String s = String.valueOf(b);
        System.out.println(s);

    }
}

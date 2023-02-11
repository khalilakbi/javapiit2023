package java_basics.control_statement;

public class LearnSwitch {
    public static void main(String[] args) {
        String op = "add";
        int a = 10;
        int b = 5;
//        if (op.equals("add")) {
//            System.out.println(a + b);
//        } else if (op.equals("sub")) {
//            System.out.println(a - b);
//        } else if (op.equals("div")) {
//            System.out.println(a / b);
//        } else if (op.equals("mul")) {
//            System.out.println(a * b);
//        }
        switch (op) {
            case "add":
                System.out.println(a + b);
                break;
            case "sub":
                System.out.println(a - b);
                break;
            case "div":
                System.out.println(a / b);
                break;
            case "mul":
                System.out.println(a * b);
                break;
            default:
                System.out.println("is not a valid arithmetic");
        }

        char ch = 'O';
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Consonant");
        }

    }
}

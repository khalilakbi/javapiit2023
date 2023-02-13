package java_basics.methods;

public class SumNumber {
    public static void main(String[] args) {

//        int sum = 0;
//        for (int i = 3; i <= 10; i++) {// i = 3 sum =3+0; 7
//            sum += i;
//        }
//        System.out.println(sum);
//        int sum2 = 0;
//        for (int i = 5; i <= 10; i++) {
//            sum2 = sum2 + i;
//        }
        SumNumber sumNumber = new SumNumber();
        int sum = sumNumber.countSum(3, 10);
        System.out.println(sum);
        SumNumber.printNumber(1, 50);
        SumNumber.printNumber(2, 7);
        //sumNumber.printNumber(1,6);
        boolean isO = sumNumber.isOdd(12);
        System.out.println(isO);
        System.out.println(sumNumber.isOdd(13));



    }

    public int countSum(int start, int ends) {
        int sum = 0;
        for (int i = start; i <= ends; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void printNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public boolean isOdd(int number){
        if(number % 2 == 0){
            return false;
        }
        return true;
    }
}

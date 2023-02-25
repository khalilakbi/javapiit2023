package groups_exercices;

public class Prime {
    public static void main(String[] args) {

        //System.out.println(isPrime(12));
        int count = 0;
        int num = 1;
        while (count < 10) {
            if (isPrime(num)) {
                System.out.print(num+" ");
                count++;
            }
            num++;
        }

    }

    static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

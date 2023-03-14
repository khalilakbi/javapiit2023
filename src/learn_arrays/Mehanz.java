package learn_arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Mehanz {
    public static void main(String[] args) {
        int []arrayA ={};
        int [] arrayB ={};
        int aA = arrayA.length;
        int aB = arrayB.length;
        int aC = aB + aA; // length of merged array
        int [] arrayC = new int[aC];

//        Arrays.sort(arrayA);
//        Arrays.sort(arrayB);



        System.arraycopy(arrayA, 0, arrayC, 0, aA);
        System.arraycopy(arrayB, 0, arrayC, aA, aB); // merged two arrays

        System.out.println(Arrays.toString(arrayC));
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arrayC.length; i++){
            set.add(arrayC[i]);
        }
        System.out.println(set);


    }

}

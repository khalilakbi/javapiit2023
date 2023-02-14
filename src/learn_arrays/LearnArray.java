package learn_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LearnArray {
    public static void main(String[] args) {
        //int [] arup = {1,5,7,4,8};// declare and initialize  literal
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 0;
        //arr [3] = 8; exception out of bound
        //System.out.println(arr[0]);

//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        arr[0] = 67;
//        System.out.println(arr[0]);

//        for(int i : arr){  // for each loop
//            System.out.println(i);
//        }
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}

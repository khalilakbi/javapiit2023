package learn_arrays;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        arr[0][0] = 12;
        arr[0][1] = 2;
        arr[0][2] = 5;
        arr[1][0] = 7;
        arr[1][1] = 4;
        arr[1][2] = 9;
        arr[2][0] = 2;
        arr[2][1] = 6;
        arr[2][2] = 8;
//        System.out.println(arr.length);// num of row
//        System.out.println(arr[0].length);// num of column
//        System.out.println(Arrays.toString(arr[1]));
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        int[][] arr2 = {{1, 2, 3},
//                {3, 2, 1},
//                {4, 5, 6},
//                {6, 5, 4}
//        };
//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0 ; j < arr2[0].length; j ++) {
//                System.out.print(arr2[i][j]+" ");
//            }
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0 ; j < arr2[0].length; j ++) {
//                if(arr2[i][j] > 4 ){
//                    System.out.println(arr2[i][j]);
//                }
//            }
//        }
        //find the min
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);


    }
}

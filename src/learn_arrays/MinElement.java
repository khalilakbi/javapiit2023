package learn_arrays;

public class MinElement {
    public static void main(String[] args) {
        int [] arr = {3,5,1,8}; // arr[2] = 1;
        int min = arr[3];
        //System.out.println(arr.length);
        for(int i = 0; i < arr.length; i++){ // min = 3; min =1
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
        //find the max using for each loop
        int max = arr[0];
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        System.out.println(max);
    }
}

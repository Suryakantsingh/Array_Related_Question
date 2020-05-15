package array;

import java.util.Arrays;

public class EvenPlaceGreater {

    public void result(int[] arr){
        Arrays.sort(arr);
        int large = arr.length-1;
        for(int i=0;i<arr.length;i+=2){
            int temp = arr[i];
            arr[i] = arr[large];
            arr[large] = temp;
            large -=1;
        }
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        EvenPlaceGreater even = new EvenPlaceGreater();
        int[] arr = {-1,2,4,-8,9,3,-5,7,11};
        even.result(arr);
    }
}

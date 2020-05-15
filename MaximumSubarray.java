package array;

import java.util.ArrayList;
import java.util.Stack;

public class MaximumSubarray {

    public int maxSubarray(int[] sum){

          int max = sum[0];
          for(int i = 0 ;i < sum.length;i++) {
                int s = 0;
              for (int j = i;j<sum.length;j++) {
                  s = s + sum[j];
                  if (s > max) {
                      max = s;
                  }
              }
          }
      return max;
    }
    public int secondApproach(int[] num){
        int max = num[0];
        int sum = num[0];

        for(int i = 1;i<num.length;i++ ){

            sum = sum+num[i];
            if(sum > max){
                max = sum;
            }
            if(sum < num[i]) {
                 max = num[i];
                 sum = 0;
             }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        System.out.println(maximumSubarray.secondApproach(arr));
    }
}

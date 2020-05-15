package array;

import java.util.*;

public class Question3Sum {

    public List<List<Integer>> threesum(int[] nums){

        List arr = Arrays.asList(nums);
        List outer = new ArrayList();
        List inner = null;
        Arrays.sort(nums);


        for(int i = 0;i<nums.length-2;i++){
             int result = 0;
             boolean flag = false;
             inner = new ArrayList();
             result = result - nums[i];
             inner.add(nums[i]);

             for(int j = i+1;j<nums.length-1;j++){
                 if(flag == true){
                     break;
                 }
                for(int k=j+1;k<nums.length;k++){
                    if(nums[k] == result-nums[j])
                    {
                        inner.add(nums[j]);
                        inner.add(nums[k]);
                        outer.add(inner);
                        flag = true;
                        break;
                    }
                }

             }

        }
        return outer;

    }
    public static void main(String[] args){
       int[] arr = new int[]{0,0,0,0};
       Question3Sum question3Sum = new Question3Sum();
       System.out.println(question3Sum.threesum(arr));
    }
}

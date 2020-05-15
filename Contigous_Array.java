package array;

import java.util.HashMap;
import java.util.Map;

public class Contigous_Array {

    public int findMaxLength(int[] nums) {
        int length = 0;
        int countZero = 0;
        int countOne = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i] == 0){
                countZero++;
            }else{
                countOne++;
            }

            if(countZero == countOne){
                if((countZero+countOne) > length) {
                    length = countZero+countOne;
                }
            }

        }
        int j = Math.abs(countZero-countOne);
        countZero = countOne = 0;
        for(int i = j; i<nums.length;i++){
            if(nums[i] == 0){
                countZero++;
            }else{
                countOne++;
            }

            if(countZero == countOne){
                if((countZero+countOne) > length) {
                    length = countZero+countOne;
                }
            }
        }
        return length;
    }
    public int secondApproach(int[] nums){
        Map map = new HashMap();
        map.put(0,-1);

        int sum = 0;
        int length = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                sum = sum+(-1);
            }else{
                sum = sum + 1;
            }
            if(map.containsKey(sum)){
                if(length < (i - (int)map.get(sum))){
                    length = i - (int) map.get(sum);
                }
            }else{
                map.put(sum,i);
            }
        }


     return length;
    }

    public static void main(String[] args) {
       // int[] arr = new int[]{0,1,0,1,1,1,0,0,1,1,0,1,1,1,1,1,1,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,0,0,0,0,1,0,0,0,1,1,1,0,1,0,0,1,1,1,1,1,0,0,1,1,1,1,0,0,1,0,1,1,0,0,0,0,0,0,1,0,1,0,1,1,0,0,1,1,0,1,1,1,1,0,1,1,0,0,0,1,1};
        int[] arr = new int[]{0,0,1,0,0,0,1,1};
        Contigous_Array array = new Contigous_Array();
        System.out.println(array.secondApproach(arr));
    }
}

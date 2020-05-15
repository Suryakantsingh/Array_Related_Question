package array;

public class SumSubArrayEqualK {

    public int subarraySum(int[] nums,int k){

        int count = 0;
        for(int i = 0 ;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum = sum + nums[j];
                if(sum == k ){
                    count++;

                }
            }
        }
      return count;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        SumSubArrayEqualK sumSubArrayEqualK = new SumSubArrayEqualK();
        System.out.println(sumSubArrayEqualK.subarraySum(arr,0));
    }
}

package array;

public class Movezeros {
    public void moveZeros(int[] nums,int val){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val) {
                if (count > 0) {
                    int k = i - count;
                    nums[k] = nums[i];
                }
            }else{
                    count++;
                }

            }

        }

    public static void main(String[] args){
       int[] arr = new int[]{3,2,2,3};
       int val = 3;
       Movezeros mv = new Movezeros();
       mv.moveZeros(arr,val);

    }
}

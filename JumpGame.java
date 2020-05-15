package array;

public class JumpGame {

    public boolean canJump(int[] nums) {

        if (nums.length == 1)
            return true;

        int len = nums[0];
        if(len == 0)
            return false;

        if(len == nums.length-1)
            return true;

        for (int i = 1; i <= len; i++) {
            if(nums[i] == 0 && i == len)
                return false;

            if(i+nums[i] < nums.length-1 && nums[i+nums[i]] != 0){
                if(nums[i] != 0 )
                 len = i + nums[i];
             }else{
                if((i+nums[i]) == nums.length -1 || i == nums.length-1){
                    return true;
                }else{
                    if(i+nums[i] > nums.length-1){
                        return true;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,0,1};
        JumpGame game = new JumpGame();
        System.out.println(game.canJump(arr));
    }
}

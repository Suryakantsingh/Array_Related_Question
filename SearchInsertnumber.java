package array;

public class SearchInsertnumber {
    public int searchInsert(int[] nums, int target){
        int l = 0 ;
        int r = nums.length-1;
        if(nums[l] > target){
            return 0;
        }
        if(nums[r] < target){
            return nums.length;
        }
        while (r>=l){
            int m = (l+r)/2;
            if(nums[m]==target){
                return m;
            }
            if(nums[m] < target){
                l = m+1;
            }else{
                r = m-1;
            }
        }


       return l;
    }

    public static void main(String[] args){
        int[] arr = new int[]{1,3,5,6};
        int target = 2;
        SearchInsertnumber searchInsertnumber = new SearchInsertnumber();
        System.out.println(searchInsertnumber.searchInsert(arr,target));
    }
}

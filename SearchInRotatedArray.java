package array;

public class SearchInRotatedArray {

    public int search(int[] nums, int target) {

        int l = 0 ; int r = nums.length-1;
          int place = 0;

          for(int i = nums.length-1 ; i>0;i--){

              if(nums[i] > nums[i-1] ) {
                  place++;

              }else{
                  break;
              }
          }
        int m = nums[r];

        if(m == target)
            return r;

        if(m > target){
            l = r - place;
        }else{
            r = r-place;
        }

          while(r >= l){
               m = (l+r)/2;

              if(nums[m] == target)
                  return m;

              if(nums[m] > target){
                  r = m-1;
              }else{
                  l = m+1;
              }

          }
          return -1;
    }
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        SearchInRotatedArray s = new SearchInRotatedArray();
        System.out.println(s.search(arr,3));
    }
}

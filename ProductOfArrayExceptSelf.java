package array;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        int countZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                product = product * nums[i];
            }else{
                countZero++;
            }
        }
        for(int j = 0 ; j < nums.length;j++){
            if(nums[j] != 0){

                if(countZero > 0 ) {
                    result[j] = 0;
                }else{
                   result[j] = product/nums[j];
                }
            }else{
                if(countZero > 1){
                    result[j] = 0;
                }else{
                    result[j] = product;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4};
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        productOfArrayExceptSelf.productExceptSelf(arr);
    }
}

package array;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        if (digits[digits.length - 1] == 9) {


            for (int i = digits.length-1; i >= 0; i--) {
                if(digits[i] == 9 ){
                    digits[i] = 0;
                }else{
                    digits[i] = digits[i]+1;
                    break;
                }
                if(i == 0){
                    int[] result = new int[digits.length+1];
                    result[0] = 1;
                    for(int j = 1;j<result.length;j++){
                        result[j] = 0;
                    }
                    return result;
                }
            }
            return digits;
        }else{
            digits[digits.length-1] = digits[digits.length-1] + 1;
        }
        return digits;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{9};
        PlusOne plusOne = new PlusOne();
        System.out.println(plusOne.plusOne(arr).toString());
    }
}

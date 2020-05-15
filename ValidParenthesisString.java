package array;

import java.util.Stack;

public class ValidParenthesisString {
    public boolean checkValidString(String s){
        int left = 0, rem = 0;
        for (char ch: s.toCharArray()) {
            left += ch == '(' ? 1 : -1;
            rem += ch != ')' ? 1 : -1;
            if (rem < 0) break;
            left = Math.max(left, 0);
        }
        return left == 0;
    }



        public boolean secondApproach(String s){

        int value = 0;
        int countZero = 0 ;
         int count = 0;

        for(int i=0 ;i<s.length() ; i++){

            if(s.charAt(i) == '('){
                if(value == 0) {
                    count = count + (countZero-count);
                }else{
                    if(value < countZero){
                        count = countZero - value ;
                    }
                }
                value++;
            }else{
                if(s.charAt(i) == ')'){

                        if(value==0 && countZero > 0){
                            countZero --;
                        }else{
                            if(value > 0  ){
                                value--;
                            }else {
                                if (value == 0 && countZero == 0) {
                                    return false;
                                }
                            }
                    }
                }else{
                    countZero++;
                }
            }
        }
         countZero = countZero - count;
        if(value == 0){
            return true;
        }else{
            if(value <= countZero){
                return true;
            }
            return false;
        }

        }

    public static void main(String[] args){
        ValidParenthesisString validString = new ValidParenthesisString();
        String str = "((*)))";
        // ((()())((()))(*;
        System.out.println(validString.checkValidString(str));
    }
}

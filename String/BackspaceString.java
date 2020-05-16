package string;

import java.util.Stack;

public class BackspaceString {
    public boolean backspaceCompare(String S, String T) {

        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        for(int i = 0;i<S.length();i++){

            if(S.charAt(i) == '#' ) {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            }else{
                stack1.push(S.charAt(i));
            }

            }

        for(int j = 0;j<T.length();j++){

        if(T.charAt(j) == '#' ) {
            if (!stack2.isEmpty()) {
                stack2.pop();
            }
        }else{
            stack2.push(T.charAt(j));
        }

    }

    while (!stack1.isEmpty() || !stack2.isEmpty()){
        if(stack1.pop().equals(stack2.pop())){

        }else
            return false;
    }
    return true;
}

    public static void main(String[] args){
        String S = "a#c";
        String T = "b";
        BackspaceString backspaceString = new BackspaceString();
        System.out.println(backspaceString.backspaceCompare(S,T));
    }
}

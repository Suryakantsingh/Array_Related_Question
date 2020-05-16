package string;

import java.util.Stack;

public class ReverseAString {

    public String reverseString(String str){
        int length = str.length();
        String result = "";
        Stack stack = new Stack();
        for(int i=length-1;i>=0;i--){
            if(str.charAt(i) == ' ') {
                while (!stack.isEmpty()){
                    result += stack.peek();
                    stack.pop();
                }
                result += str.charAt(i);
            }else{
                stack.push(str.charAt(i));
            }
        }
        if(!stack.isEmpty()){
            while(!stack.isEmpty()){
                result += stack.peek();
                stack.pop();
            }
        }
        return result;
    }
    public static void main(String[] args){
        ReverseAString rev = new ReverseAString();
        System.out.println(rev.reverseString("I love java programming"));
    }
}

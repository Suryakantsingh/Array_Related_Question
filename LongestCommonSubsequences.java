package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class LongestCommonSubsequences {
    public int longestCommonSubsequence(String text1, String text2) {

        List<Character> one  = new ArrayList<>();
        List<Character> two  = new ArrayList<>();

        int count = 0;
        int count1 = 0;
        int order = -1;


            for(int i=0;i<text1.length();i++){
                one.add(text1.charAt(i));
            }

            for(int i = 0 ; i < text2.length(); i++){
                if(one.contains(text2.charAt(i)) && one.indexOf(text2.charAt(i)) > order){
                    count++;
                    order = one.indexOf(text2.charAt(i));
                }
            }

            order = -1;
            for(int j=0;j<text2.length();j++){
                two.add(text2.charAt(j));
            }

            for(int i = 0 ; i <text1.length(); i++){
                if(two.contains(text1.charAt(i)) && two.indexOf(text1.charAt(i)) > order){
                    count1++;
                    order = two.indexOf(text1.charAt(i));
                }
            }
            if(count > count1){
                return count;
            }else{
                return count1;
            }

    }

    public static void main(String[] args) {
        String text1 = "oxcpqrsvwf";
        String text2 = "shmtulqrypy";
        LongestCommonSubsequences longestCommonSubsequences = new LongestCommonSubsequences();
        System.out.println(longestCommonSubsequences.longestCommonSubsequence(text1, text2));
    }
}

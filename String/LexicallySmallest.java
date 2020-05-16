package string;

public class LexicallySmallest {

    public String smallestString(String str){
        int l = str.length();
        String ans = "";
        for(int i = 0 ;i < l-1 ;i++ ) {
           if(str.charAt(i) > str.charAt(i+1)){
               for(int j = 0 ; j < l ; j++){
                   if(i != j){
                       ans += str.charAt(j);
                   }
               }
               return ans;
           }
        }
            ans = str.substring(0,l-1);
    return ans;
    }


    public static void main(String[] args){
        LexicallySmallest lexicallySmallest = new LexicallySmallest();
        System.out.println(lexicallySmallest.smallestString("cbada"));

    }
}

package string;

public class ReverseUsingRecursion {

    public void reverse(String str){
        if(str == null || str.length()<=1){
            System.out.println(str);
        }else{
            System.out.print(str.charAt(str.length()-1)+" ");
           // System.out.println(str.substring(0,str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }
    public static void main(String[] args){
        ReverseUsingRecursion rs = new ReverseUsingRecursion();
        rs.reverse("This is DIDI");

    }
}

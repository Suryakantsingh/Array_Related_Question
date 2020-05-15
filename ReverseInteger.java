package array;

public class ReverseInteger {
    public int reverse(int x){


        boolean flag  = false;
        int result = 0;
        int overflow = 0;

        if(x < 0){
             x = Math.abs(x);
             flag = true;
        }
        int k = 0;
       while( x != 0){
           overflow = result;
           result = (x%10)+ result*10;
           if ((result / 10) < overflow || (result > 0 && overflow < 0)) {
               return 0;
           }
           x = x/10;
       }
       if(flag == true)
           result = 0 - result;
      //Integer i = new Integer(result);

       return result;
    }
    public static void main(String[] args){
        ReverseInteger rev = new ReverseInteger();
        System.out.println(rev.reverse(1534236469));
    }
}

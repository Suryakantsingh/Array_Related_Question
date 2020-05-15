package array;

public class BitwiseAnd {

    public int rangeBitwiseAnd(int m,int n){
        int and = 0 ;
        for(int i=m;i<n;i++){
           and = m & (m+1);
        }
        return and;
    }
    public int secondApproach(int m, int n){
        while (m < n ){

            n-= (n & -n);

        }
        return n;
    }
    public static void main(String[] args){
       BitwiseAnd bit = new BitwiseAnd();
       System.out.println(bit.secondApproach(5,7));
    }
}

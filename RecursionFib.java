package array;

import java.util.HashMap;

public class RecursionFib {
    HashMap map = new HashMap();
    public int fib(int N){
        if(N < 2){
            return N;
        }else{
            if(map.containsKey(N)){
                return (int)map.get(N);
            }else{
                map.put(N-1,fib(N-1));
                map.put(N-2,fib(N-2));
            }
            return (int)map.get(N-1)+(int)map.get(N-2);
        }
    }

    public static void main(String[] args){
        RecursionFib rf = new RecursionFib();
        System.out.println(rf.fib(4));

    }
}

package array;

import java.util.HashMap;

public class ClimbingStairs {
    HashMap map = new HashMap();
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }else{
            if(map.containsKey(n)) {
                return (int) map.get(n);
            }else{
                map.put(n-1,climbStairs(n-1));
                map.put(n-2,climbStairs(n-2));
            }
        }
        return (int)map.get(n-1)+(int)map.get(n-2);
    }

    public static void main(String[] args) {

        ClimbingStairs stairs = new ClimbingStairs();
        System.out.println(stairs.climbStairs(1));

    }
}

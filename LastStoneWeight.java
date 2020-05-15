package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {

        if(stones.length == 0)
            return 0;
        List alist = new ArrayList();
        for(int i = 0 ; i< stones.length;i++){
            alist.add(stones[i]);
        }
        Collections.sort(alist);

        while(alist.size() > 1){
            int firstIndex = alist.size()-1;
            int secondIndex = alist.size()-2;
            int first = (int)alist.get(firstIndex);
            int second = (int)alist.get(secondIndex);

            if(first == second){
                alist.remove(firstIndex);
                alist.remove(secondIndex);
            }else{
                alist.set(alist.size()-1,(first-second));
                alist.remove(secondIndex);

            }
            Collections.sort(alist);

        }

        int result = alist.isEmpty() ? 0 : (int)alist.get(0);
        return result;
    }
    public static void main(String[] args){
        int[] arr = {2,2};
       LastStoneWeight lastStoneWeight = new LastStoneWeight();
       System.out.println(lastStoneWeight.lastStoneWeight(arr));
    }
}

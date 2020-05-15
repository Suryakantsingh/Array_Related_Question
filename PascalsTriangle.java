package array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outer = new ArrayList<List<Integer>>(numRows);
        List inner = null;


        for (int i = 0; i < numRows; i++) {
            inner = new ArrayList();
            if(i==0){

                inner.add(1);

            }
            if(i==1){

                    inner.add(1);
                    inner.add(1);

                }


            int k = 0;
            for (int j = 0; j <= i && i>=2; j++) {

                if(j==0 || j==i){
                    inner.add(j,1);

               }else{
                   inner.add((int)outer.get(i-1).get(k++)+(int)outer.get(i-1).get(k));


                }

            }
            outer.add(inner);

        }
       return outer;
    }

    public static void main(String[] args) {
        PascalsTriangle triangle = new PascalsTriangle();
       System.out.println( triangle.generate(5));
    }
}

package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PascalTriangleII {

    public List<Integer> getRow(int rowIndex){
        int[][] arr = new int[rowIndex+2][rowIndex+2];
        ArrayList list  = new ArrayList();
        int length = rowIndex+1;
        for(int i=1;i<=length;i++){
            if(i==1 || length==i){
                list.add(1);
            }else{
                list.add(value(length,i,arr));
            }
        }
        return list;
    }
    public int value(int i,int j,int[][] arr){

        if(j==1 || i == j){
           return 1;
        }else{
            if(arr[i][j] != 0){
                return arr[i][j];
            }else{
                arr[i-1][j-1] = value(i-1,j-1,arr);
                arr[i-1][j] = value(i-1,j,arr);
            }

            return arr[i-1][j-1]+arr[i-1][j];
        }

    }
    public static void main(String[] args){
        PascalTriangleII pascal = new PascalTriangleII();
        System.out.println(pascal.getRow(3));

    }
}

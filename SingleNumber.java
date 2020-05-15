package array;

public class SingleNumber {

    public int singleNumber(int[] arr){
         for(int i=0 ; i < arr.length ; i++){
             int count = 0;
             for(int j = 0 ;j < arr.length;j++){
                 if(i != j && arr[i] == arr[j]){
                     count++;
                 }

             }
             if(count == 0 )
             return arr[i];
         }
         return 0;
    }
    public static void main(String[] args){
       int[] arr = new int[]{2,2,1};
       SingleNumber single = new SingleNumber();
       System.out.println(single.singleNumber(arr));
    }
}

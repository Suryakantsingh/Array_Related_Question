package array;

public class StringShift {

    public String stringShift(String s, int[][] shift){

        StringBuffer str = new StringBuffer(s);
        for (int i = 0 ; i<shift.length;i++){
            int[] arr = shift[i];


            if(arr[0] == 0){
                for(int j = 1 ; j <= arr[1]; j++){
                    char ch = str.charAt(0);
                    str.deleteCharAt(0);
                    str.append(ch);
                }
            }

            if(arr[0] == 1){
                for(int j = 1 ; j <= arr[1]; j++){
                    char ch = str.charAt(str.length()-1);
                    str.deleteCharAt(str.length()-1);
                    str.insert(0,ch);
                }
            }

        }
        return str.toString();
    }
    public static void main(String[] args){
        int[][] shift = {{1,1},{1,1},{0,2},{1,3}};
        StringShift sft = new StringShift();
        String str = "abcdefg";
        System.out.println(sft.stringShift(str,shift));
    }
}

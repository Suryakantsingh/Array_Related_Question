package array;

import java.util.*;

public class GroupAnagram {

    public List<List<String>> groupAnagram(String[] strs){

        List<List<String>> outer = new LinkedList<List<String>>();
        LinkedList inner = null;
        HashMap m = new HashMap();

        for(int i=0;i<strs.length;i++){

            String newString = strs[i];
            char[] ch =  strs[i].toCharArray();

                Arrays.sort(ch);
               String str = new String(ch);

            if(m.containsKey(str)){
                outer.get((int)m.get(str)).add(newString);
             } else{

                inner = new LinkedList();
                inner.add(strs[i]);
                outer.add(inner);
                m.put(str,outer.size()-1);
            }

        }
        return outer;
    }
    public static void main(String[] args){
        GroupAnagram groupAnagram = new GroupAnagram();
        String[] arr = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagram.groupAnagram(arr));
    }
}

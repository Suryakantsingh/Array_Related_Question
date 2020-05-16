package string;

import java.util.*;

public class FindNnaturalNumber {

    public int findPureNumber(int n){
        String str1 = "44";
        String str2 = "55";
        Queue queue = new LinkedList();
        ((LinkedList) queue).add(str1);
        ((LinkedList) queue).add(str2);
        List list = new ArrayList();

        while(list.size() < n){
               String temp = queue.poll().toString();
               list.add(new Integer(temp));

            queue.add("4"+temp+"4");
            ((LinkedList) queue).add("5"+temp+"5");

        }
        Collections.sort(list);
        int result = (int)list.get(n-1);
        return result;

    }
    public static void main(String[] args){
        FindNnaturalNumber findNnaturalNumber = new FindNnaturalNumber();
        System.out.println(findNnaturalNumber.findPureNumber(4));

    }
}

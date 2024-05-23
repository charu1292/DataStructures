package arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementUsingMap {
    //A majority element in an array A[] of size n is an element that appears more than n/2 times
    //time comlexity= O(n) space =O(n)
    public static void checkMajority(int[] A) {
        int n=A.length;
            int MajorityElementfreq=(n/2)+1;
        if (A == null)
            return;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                Integer key= entry.getKey();
                Integer value=entry.getValue();
                if (entry.getValue()>=MajorityElementfreq)
                    System.out.print(key);
            }

    }

    public static void main(String[] args) {
        int[] A = {2, 1, 1, 1, 2, 1, 1, 1, 4, 1};

        checkMajority(A);

    }
}

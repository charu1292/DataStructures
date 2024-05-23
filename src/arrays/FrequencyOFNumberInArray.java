package arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOFNumberInArray {
    public static void frequnecyChecker(int[] A){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<A.length;i++){
//            if(map.containsKey(A[i]))
                map.put(A[i], map.getOrDefault(A[i],0)+1);
//            else map.put(A[i],1);
        }
        for (Map.Entry<Integer, Integer> entry :map.entrySet()){
            Integer key=entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key + ":" +value);
        }
    }
    public static void main(String[] args) {

        int[] A={22,44,66,77,88,22,44,22,3};
        frequnecyChecker(A);

    }
}

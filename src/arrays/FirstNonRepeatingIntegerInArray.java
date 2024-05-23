package arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingIntegerInArray {
    public static int nonRepeating(int[] A){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<A.length;i++){
            if (map.containsKey(A[i])){
                map.put(A[i], map.get(A[i])+1);
            }
            else
                map.put(A[i],1);
        }
        int res=0;
        for (int i=0;i<A.length;i++){
            if(map.get(A[i])==1){
                res=A[i];
                break;
            }

        }
        return res;
    }


    public static void main(String[] args) {
       int[] A={22,77,33,44,55,55,22};
        int c=nonRepeating(A);
        System.out.println(c);
    }
}

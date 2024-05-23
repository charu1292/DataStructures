package String;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCharacter {
    public static void frequnecyChecker(String S){
        char[] A=S.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0;i<A.length;i++){
            if(map.containsKey(A[i]))
                map.put(A[i], map.getOrDefault(A[i],0)+1);
            else map.put(A[i],1);
        }
        for (Map.Entry<Character, Integer> entry :map.entrySet()){
            Character key=entry.getKey();
            Integer value=entry.getValue();
            System.out.print(key +""+value);
        }
    }
    public static void main(String[] args) {
        String s="aabbbccccddddddee";
        frequnecyChecker(s);

    }
}

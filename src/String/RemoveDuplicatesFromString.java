package String;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromString {

    public static String removeCharactersUsingMap(String s){
        char[] A=s.toCharArray();
        StringBuilder st = new StringBuilder();
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0;i<A.length;i++){
            if(!map.containsKey(A[i])) {
                st.append(A[i]);
                map.put(A[i], 1);
            }

        }
        return st.toString();
        }

        public static String removeDuplicates(String s){
         int j=0;
         int i=1;
         char[] arr=s.toCharArray();
         while(i<arr.length){
             if(arr[j]!=arr[i]){
                arr[++j]=arr[i++];
             }
             else
                 i++;

         }
         StringBuilder sb=new StringBuilder(); //iterate array from 0 to j
            for(int k=0;k<=j;k++){
                sb.append(arr[k]);
            }
            return sb.toString();
        }
    public static void main(String[] args) {
        String s = "HappyNewYearr";
        String result=removeDuplicates(s);

        System.out.println(result);
    }
}

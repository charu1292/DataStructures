package String;

import java.text.Format;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {

    public static void duplicateCharacters_1(String S) {
        char[] s = S.toCharArray();

        for (int i = 0; i < s.length; i++) {
            int counter = 1; // Counter to count occurrences of each character
            for (int j = i + 1; j < s.length; j++) {
                if (s[i] == s[j]) {
                    counter++;
                    s[j] = '\0'; // Mark the character as visited
                }
            }
            // Print the character if it's a duplicate
            if (counter > 1 && s[i] != '\0') {
                System.out.print("Duplicate character: " + s[i]);
            }
        }
    }



    public static void duplicateCharacters_2(String s){
        char[] A=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.getOrDefault(A[i],0)+1);
            }
            else map.put(A[i],1);
        }

        for (Map.Entry<Character,Integer> entry: map.entrySet()){
            if (entry.getValue()>1){
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    public static void main(String[] args) {
        String s = "Geeks for Geek";
        duplicateCharacters_1(s);
        duplicateCharacters_2(s);
    }
}

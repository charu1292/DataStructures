package String;

import java.util.*;

public class GroupAnnagrams {
    public static void Annagram(String[] s) {
        Map<String, List<String>> anagramsMap = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            char[] str = s[i].toCharArray();
            Arrays.sort(str);
            String s1 = new String(str);
            if (!anagramsMap.containsKey(s1)) {
                anagramsMap.put(s1, new ArrayList<>());
            }
            List<String> list = anagramsMap.get(s1);
            list.add(s[i]);
        }

        for (Map.Entry<String, List<String>> entry : anagramsMap.entrySet()) {
            for (String S1 : entry.getValue()) {
                if (entry.getValue().size() > 1) {
                    System.out.print(S1 + " ");
                }

            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        String[] s = {"eat", "tea", "nat", "tan", "ate", "map", "nap"};
        Annagram(s);
    }
}
package Leet_code;

import java.util.*;

class Pair {
    char c;
    int freq;

    public Pair(char c, int freq) {
        this.c = c;
        this.freq = freq;
    }
}
public class SortCharactersByFrequency {

    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.freq - o1.freq; // to return in descending order
            }
        });

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            priorityQueue.add(new Pair(entry.getKey(), entry.getValue()));
        }

        StringBuilder result = new StringBuilder();
        while (!priorityQueue.isEmpty()) {   // to remove elements from priority queue is logN
            Pair pair = priorityQueue.remove();
            while (pair.freq  > 0) {
                result.append(pair.c);
                pair.freq--;
            }
        }
        return result.toString();
    }


    public static String frequencySortArrayWay(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        Pair[] arr = new Pair[map.size()];
        int i = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            arr[i++] = new Pair(entry.getKey(), entry.getValue());
        }

        Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair t1, Pair t2) {
                return t2.freq - t1.freq;
            }
        });

        StringBuilder result = new StringBuilder();

        for(Pair pair : arr) {
            while (pair.freq  > 0) {
                result.append(pair.c);
                pair.freq--;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {

        String s = "tree";
        System.out.println(frequencySortArrayWay(s));

    }
}



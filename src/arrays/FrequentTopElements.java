package arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Pair {
    int value;
    int freq;

    public Pair(int value, int freq) {
        this.value = value;
        this.freq = freq;
    }
}
public class FrequentTopElements {
    public static void FrequentElementsTop(int[] A, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }


        Pair[] arr = new Pair[map.size()];

        int x = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arr[x] = new Pair(entry.getKey(), entry.getValue());
            x++;
        }


        Arrays.sort(arr, (a, b) -> b.freq - a.freq);

        x = 0;
        while (x < k) {
            System.out.println(arr[x++].value);
        }
    }

    public static void main(String[] args) {
        int[] A = {8, 1, 4, 4, 8, 2, 6, 1, 9, 10, 1, 4};
        int K = 2;
        FrequentElementsTop(A, K);

    }
}
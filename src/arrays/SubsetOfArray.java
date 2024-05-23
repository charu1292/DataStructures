package arrays;

import java.util.HashMap;
public class SubsetOfArray {
    //Option 1 --Time Complexity: O(M*N)

        static boolean isSubset_3(int arr1[], int m, int arr2[], int n) {

            if (m > n) return false;

            HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();

            for (int i = 0; i < n; i++) {
                mp.put(arr2[i], mp.getOrDefault(arr2[i], 0) + 1); // Fixed variable name here
            }

            for (int j = 0; j < m; j++) {
                if (mp.containsKey(arr1[j])) {
                    mp.put(arr1[j], mp.get(arr1[j]) - 1);
                    if (mp.get(arr1[j]) == 0) {
                        mp.remove(arr1[j]);
                    }
                } else {
                    return false; // If arr1[j] is not found in arr2, then arr1 is not a subset of arr2
                }
            }
            return true; // Return true only after checking all elements in arr1
        }


    public static void main(String[] args) {
        int arr1[]={1,3,4,5,2,2};
        int arr2[]={2,4,3,1,7,5,15};
        int m = arr1.length;
        int n = arr2.length;
        boolean ans = isSubset_3(arr1, m, arr2, n);
        if (ans == true)
            System.out.print("arr1[] is a subset of arr2[]");
        else System.out.print("arr1[] is not a subset of arr2[]");

    }
}

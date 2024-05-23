package arrays;

import java.util.ArrayList;

public class MergeSort {
    ///time complexity  is log base 2 n.

//    Java ArrayList class uses a dynamic array for storing the elements.
//    It is like an array, but there is no size limit. We can add or remove elements anytime.
//     So, it is much more flexible than the traditional array.


    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergesort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2 ;
        mergesort(arr, low, mid);  // left half
        mergesort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high);  // merging sorted halves
    }


    public static void main(String[] args) {
        int[] A ={3,45,12,46,98,65,88,21};
        int n=A.length;
        int s=0;
        int e=n-1;
        mergesort(A,s,e);
        for(int i =0;i<A.length;i++){
            System.out.print(A[i] + " ");
        }
    }
}

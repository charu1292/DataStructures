package arrays;

public class MergeSortedArrayInPlace {

    public static void merge(int[] A, int m, int[] B, int n) {
        int indexA = m - 1; // Index of last element in array A
        int indexB = n - 1; // Index of last element in array B
        int mergeIndex = m + n - 1; // Index to merge into, starting from the end of A

        // While there are elements in both arrays
        while (indexA >= 0 && indexB >= 0) {
            if (A[indexA] > B[indexB]) {
                A[mergeIndex--] = A[indexA--];
            } else {
                A[mergeIndex--] = B[indexB--];
            }
        }
        // If elements are remaining in B
        while (indexB >= 0) {
            A[mergeIndex--] = B[indexB--];
        }
    }

    public static void main(String[] args) {
        int[] A = {5,6,7, 0, 0, 0, 0};
        int[] B = {5, 6, 7, 8};
        int m = 3; // Number of elements in A
        int n = 4; // Number of elements in B

        merge(A, m, B, n);

        // Print the merged array
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}

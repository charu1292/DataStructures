package arrays;

public class Sort_0_1_2 {

    public static void sortArray_0_1_2(int[] A) {
        int n = A.length;
        int l = 0;
        int mid = 0;
        int h = n - 1;
        while (mid <= h) {
            if (A[mid] == 0) {
                swap(A,mid, l);
                mid++;
                l++;
            } else if (A[mid] == 1) {
                mid++;
            } else if (A[mid] == 2) {
                swap(A,mid, h);
                h--;
            }
        }
    }

    private static void swap(int[] A,int i, int j) {
        A[i] = A[i] + A[j];
        A[j] = A[i] - A[j];
        A[i] = A[i] - A[j];

    }

    public static void displayArray(int[] M, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(M[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] A={0,1,2,1,1,2,0,0};
        sortArray_0_1_2(A);
        displayArray(A,A.length);
    }

}
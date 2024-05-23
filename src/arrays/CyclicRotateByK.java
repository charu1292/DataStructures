package arrays;
public class CyclicRotateByK {
    public static void rightrotate(int[] A,int k){
        int n =A.length;
        k=k%n;    // it gives at which position we need to rotate
        rotatefunc(A, 0, n - 1); // rotate the whole array
        rotatefunc(A, 0, k - 1); // rotate the first part up to k
        rotatefunc(A, k, n - 1); // rotate the remaining part from k to end
    }
    public static void leftrotate(int[] A,int k){
        int n =A.length;
        k=k%n;  // it gives at which position we need to rotate
        rotatefunc(A, 0, n - 1); // rotate the whole array
        rotatefunc(A, 0, n - k - 1); // rotate the first part up to n-k
        rotatefunc(A, n - k, n - 1); // rotate the remaining part from n-k to end
    }
    public static void rotatefunc(int[] A,int i,int j){
        while(i<j){
            swap(A,i,j);
            i++;
            j--;
        }
    }
    private  static  void swap(int[]A,int i,int j){
        A[i] = A[i] + A[j];
        A[j] = A[i] - A[j];
        A[i] = A[i] - A[j];
    }
    public static void displayArray(int[] A,int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] A={1,2,3,4,5};
        int k=1;
         rightrotate(A,k);
        displayArray(A,A.length);
//        leftrotate(A,k);
//        System.out.println();
//        displayArray(A,A.length);
    }
}

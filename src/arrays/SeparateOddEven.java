package arrays;

public class SeparateOddEven {
    public static void separateOddEven(int[] A) {
        int n = A.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            while (i < j && A[i] % 2 != 0) {
                i++;
            }
            while (j > i && A[j] % 2 == 0) {
                j--;
            }
            if (i < j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] A={1,2,3,4,5,6,7,8,9,10};
        //output A={0,0,0,0,1,1,1,1,1}
        separateOddEven(A);
        for (int i=0;i<A.length;i++){
            System.out.print(A[i] +" ");
        }
    }
}

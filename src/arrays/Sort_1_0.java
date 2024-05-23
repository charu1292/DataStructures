package arrays;

public class Sort_1_0 {

    public static void separate(int[] A) {
        int n = A.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            while(i < n && A[i] == 0) {
                i++;
            }
            while(j > 0 && A[j] == 1) {
                j--;
            }
            if(i < j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] A={1,0,1,1,0,0,1,0,1};
        //output A={0,0,0,0,1,1,1,1,1}
        separate(A);
        for (int i=0;i<A.length;i++){
            System.out.print(A[i] +" ");
        }
    }
}

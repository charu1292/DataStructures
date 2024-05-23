package arrays;

public class CheckSumwith3Pairs {

    public static void getPairsIfSum3PAirs(int[] A,int n ,int x) {
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n-1; j++)
                for (int k = i + 2; k < n; k++)
                if (A[i] + A[j] +A[k] == x) {
                    System.out.println("pair found " + A[i] + " : " + A[j] + " : " + A[k]);

                }
        }
    }
    public static void main(String[] args) {
        int[] A ={1,2,8,9,4,5,7,4,3,10,0};
        int n = A.length;
        int x=10;
        getPairsIfSum3PAirs(A,n,x);

    }
}

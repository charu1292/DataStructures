package arrays;

public class MissingNumber {

    public static int MissingNumber(int[] A){
        int n=A.length;
        int sum=(n * (n + 1)) / 2;
        for(int i=0;i<n;i++){
            sum-=A[i];
        }
        return sum;
    }
//
//    public static int missingNumberwithXOR(int[] A){
//
//    }

    public static void main(String[] args) {
        int[] A={0,1,2,4,5,6};
        int num=MissingNumber(A);
        System.out.println(num);
    }


}

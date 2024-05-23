package arrays;

public class CheckArraySorted {
    public static boolean check_array(int[] A){
        int n = A.length;
        for(int i=1;i<n;i++){
            if(A[i]>=A[i-1]){

            }
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] A = {2,2,2,4,2,7};
        System.out.println(check_array(A));

    }
}

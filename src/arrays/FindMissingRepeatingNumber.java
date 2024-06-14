package arrays;

public class FindMissingRepeatingNumber {

    public static int[] missingRepeatingNumber(int[] A,int n) {//cyclic sort complexity-O(N)
        for(int i = 0; i < A.length;) {
            if(A[i] == i || A[A[i]] == A[i]) {
                i++;
            } else {
                int t = A[i];
                A[i] = A[A[i]];
                A[t] = t;
            }
        }
        int[] res = new int[2];
        for(int i = 0; i < A.length; i++) { //0,1,1,3,4,5
            if(A[i] != i) {     //check the which is missing
                res[0] = A[i];
                res[1] = i;
            }
        }
        return res;
        }

    public static void main(String[] args) {
        int[] A = {0, 2, 4, 5, 2, 3};//0,1,1,3,4,5
        int n=A.length;
        int[] d=missingRepeatingNumber(A,n);

       System.out.println("The repeating and missing numbers are: {"
              + d[0] + ", " + d[1] + "}");
    }
}
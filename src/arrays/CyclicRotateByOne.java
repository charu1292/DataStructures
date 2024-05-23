package arrays;

public class CyclicRotateByOne {
    public static void getRotateByOne(int[] A,int n){
        int temp=A[n-1];    // store last index value to temp
        for(int i=n-2;i>=0;i--){           // the shift each index value to right and make 0the index free
            A[i+1]=A[i];
        }
        A[0]=temp;   // put last value of array to 0 the index
    }

    public static void displayArray(int[] A,int n){
        for (int i =0;i<n;i++){
            System.out.print(A[i] + " ");
        }
    }

    public static void main(String[] args) {
        int A[]={1,2,3,4,5};
        int n=A.length;
        getRotateByOne(A,n);
        displayArray(A,n);
    }
}

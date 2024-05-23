package arrays;

import static java.util.Arrays.sort;


//1.You can sort the array and first element will your minimum and last element of an array is maximum
//2.Secondly,we can set min and max first and the iterate though each element of an array and compare if A[i] if
// smaller and greater than current min and max ,if yes then swap the value of min and max and then print it .
public class MinMax {
    public void getMinMaxUsingSort(int[] A){
        int n=A.length;
        sort(A);
        int min=A[0];
        int max=A[n-1];
        System.out.println("min" + " " + min);
        System.out.println("max" + " " + max);

    }
    public void getMinMaxWithoutSort(int[] A){
        int n=A.length;
        int min = 0;
        int max= 0;
        if(A[0]<A[1]){
            min=A[0];
            max=A[1];
        }
        else if (A[0]>A[1]) {
            min=A[1];
            max=A[0];
        }

        for(int i=2;i<n;i++) {
            if (A[i] < min) {
                min=A[i];

            }
            else if (A[i]>max)
                max=A[i];
        }
        System.out.println("min" + " " + min);
        System.out.println("max" + " " + max);

    }


        public static void main(String[] args) {
            int[] A={23,55,1,44,9,8};
           MinMax mm=new MinMax();
           mm.getMinMaxUsingSort(A);
           mm.getMinMaxWithoutSort(A);

        }
    }


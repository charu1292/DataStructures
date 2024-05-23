package arrays;
//take a smallest element and try to put it into first position
//time complexity O N^2
public class SelectionSort {

    public static void getsort(int A[]){
        int n =A.length;
        for(int i=0;i<n-1;i++){ //n
            int smallest=i;
            for(int j=i+1;j<n;j++){  //n
                if(A[smallest]>A[j]) {
                    smallest =j;
                }
            }
            int temp=A[smallest];
            A[smallest]=A[i];
            A[i]=temp;
        }
    }

    public static void display(int[]A ){
        int n =A.length;
        for(int i=0;i<n;i++){
            System.out.print(A[i] + " ");
        }
    }


    public static void main(String[] args) {
       int[] A ={2,7,1,10,3,8,12};
        getsort(A);
        display(A);
    }
}

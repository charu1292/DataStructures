package arrays;

//first fix the sorted part A[0] and 1-length is unsorted part

public class InsertionSort {

    ///time complexity  is n2

    public static void insertion_sort(int[] arr) {
     //unsorted part
        for(int i=1; i<arr.length; i++){       //let A[0] is sorted and start the loop from 1
            int current=arr[i];                // starting from element as current
            int j=i-1;                        // taking j last element of sorted part
            while(j>=0 && current < arr[j]){  //run a loop to make a space until we found the correct position
                arr[j+1]=arr[j];              //shift the element to right
                j--;                          //decrement j
            }
            //palcement
            arr[j+1] = current;       // put the element in correct space
        }
    }
    public static void main(String[] args) {
        int[] A ={22,11,20,89,5};
        insertion_sort(A);
        for (int i=0; i<A.length; i++){
            System.out.print(A[i]+ " ");
        }
    }
}

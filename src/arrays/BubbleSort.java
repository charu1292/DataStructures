package arrays;
//In this we take the heaviest/largest element and try to shift at
// last of array by pushing it right by compare it with every adjacent element.
public class BubbleSort {

    ///time complexity  is n2
    public static void bubble_sort(int[] arr) {
        for(int i = 0; i < arr.length - 1 ; i++) {  //n-1
            for(int j = 0; j < arr.length - i - 1; j++) {  //n
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }


    public static void main(String[] args) {

        int A[]={22,44,525,2,1,8};
        bubble_sort(A);
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}

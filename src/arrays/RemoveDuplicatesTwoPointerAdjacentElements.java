package arrays;

public class RemoveDuplicatesTwoPointerAdjacentElements {
    ///its also called inplace array --big of N
    //adjacent element duplicates

    static int removeDuplicates(int[] arr) {
        int i = -1;
        for (int j = 0; j < arr.length; j++) {
            if(i == -1 || arr[i] != arr[j])
            {
                arr[++i] = arr[j];
            }
            else                  //if we want to remove all adjacent elements else remove else condition
                i--;
        }
        return i;    //if want to return length just return i+1
    }
    public static void main(String[] args) {
        int A[] = {5,4,1,1,2,3,3,2};
        int k = removeDuplicates(A);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i <= k; i++) {
            System.out.print(A[i] + " ");
        }
    }
}

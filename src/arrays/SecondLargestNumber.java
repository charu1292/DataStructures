package arrays;

public class SecondLargestNumber {
    public static int second_largest_number(int[] A) {
        if (A.length < 2) {
            return -1; // If array has less than 2 elements, there's no second largest
        }
        int largest, second_largest;
        if (A[0] > A[1]) {
             largest = A[0];
             second_largest = A[1];
        }
        else{
            largest = A[1];
            second_largest = A[0];

        }
        for (int i = 2; i < A.length; i++) {
            if (A[i] > largest) {
                second_largest = largest;
                largest = A[i];
            } else if (A[i] > second_largest && A[i] != largest) {
                second_largest = A[i];
            }
        }

        return second_largest;
    }

    public static void main(String[] args) {
        int[] A = {3, 45, 12, 46, 98, 65, 88, 21};
        int n = A.length;
        int c = second_largest_number(A);
        System.out.print(c);
    }
}

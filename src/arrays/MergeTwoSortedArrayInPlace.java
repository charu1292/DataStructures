package arrays;

public class MergeTwoSortedArrayInPlace {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int i=m-1;
            int j=n-1;
            int k=m+n-1;
            while(i >= 0 && j >= 0)
                if(nums1[i]>nums2[j]){
                    nums1[k--]=nums1[i--];
                }
                else{
                    nums1[k--] = nums2[j--];
                }
            while (j >= 0) {
                nums1[k--] = nums2[j--];
            }

        }

    public static void main(String[] args) {
        int [] nums1 = {1,3,7,0};
        int m = 3;
        int[] nums2 = {2};
        int n = 1;
        System.out.print("num1 :");
        for(int i=0;i<m+n;i++){
            System.out.print( nums1[i] + " ");
        }
        System.out.println();
        System.out.print("num2 :");
        for(int i=0;i<n;i++){
            System.out.print(nums2[i] + " ");
        }
        System.out.println("\nafter merge");
        merge(nums1,m,nums2,n);
        for(int i=0;i<m+n;i++){
            System.out.print(nums1[i] + " ");
        }
    }
}

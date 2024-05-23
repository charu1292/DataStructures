package arrays;

public class BinarySearch {

    public static int getElement(int[] A , int x,int s,int e){
        while(e>=s){
                int mid = s + (e - s) / 2;
                if(A[mid]==x)
                    return mid;
                if (A[mid] < x)
                    s=mid + 1;
                else
                    e=mid - 1;
            }
           return -1;
        }


        public static int getElementRecursive(int[] A , int x,int s,int e) {
            if (e >=s ) {
                int mid = s + (e - s) / 2;
                if(A[mid]==x)
                    return mid;
                if (A[mid] < x)
                    return getElementRecursive(A, x, mid + 1, e);
                else
                    return getElementRecursive(A, x, s, mid - 1);
            }
            return -1;
        }


        public static void main(String[] args) {
            int[] A = {22,55,66,77,88,99,100};
            int x=77;
            int n= A.length;
            int result=getElement(A,x,0,n-1);
            if (result==-1)
                System.out.println("data not found in array");
            else
            System.out.println("data is found in this index" + " " + result);

        }
}

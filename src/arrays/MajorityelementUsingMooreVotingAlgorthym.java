package arrays;

public class MajorityelementUsingMooreVotingAlgorthym {
    //time comlexity= O(n) space =O(1)
    public static int majorityElement(int[] arr){
        int maj = arr[0];
        int cnt = 1;   //Set maj to the first element of the array arr[0], and set cnt to 1.
        for(int i = 1; i < arr.length; i++){
            if(cnt == 0){
                maj = arr[i];
                cnt = 1;
            }
            else {
                if(arr[i] == maj){  //if current element = maj ,increment cnt
                    cnt++;
                }
                else cnt--;           //else decrement cnt
            }
        }
        int c=0;  //need to verify if the maj element is indeed the majority element by counting its occurrences in the array.
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==maj){
                c++;
            }
        }
        if(c > arr.length/2) {
            return maj;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,4,1};
        System.out.println(majorityElement(arr));
    }
}

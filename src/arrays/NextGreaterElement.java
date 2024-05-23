package arrays;

import java.util.Stack;

public class NextGreaterElement {

    public static int[] NextGreaterElement(int[] A,int n) {
        Stack<Integer> ss=new Stack<>();
        int[] result=new int[n];
        result[n-1]=-1;
        ss.push(A[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!ss.empty()&&ss.peek()<A[i]){
                ss.pop();
            }
            if(ss.isEmpty()){
                result[i]=-1;
            }
            else{
                result[i]=ss.peek();
            }
            ss.push(A[i]);
        }
        return result;
    }

    public static void main(String[] args) {

        int[] A = {1 ,3,2,4};
        int n=A.length;
        int[]c =NextGreaterElement(A,n);

        for(int i=0;i<c.length;i++){
            System.out.print(c[i] + " ");
        }

    }
}
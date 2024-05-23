package arrays;

public class FabanacciNth {


    static int fabanacci(int n){

        return(n<=1?n:fabanacci(n-1)+fabanacci(n-2));
    }


    public static void main(String[] args) {
        System.out.println(fabanacci(5));

    }
}

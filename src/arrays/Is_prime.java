package arrays;

public class Is_prime {
    public static boolean is_prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void print_primes(int n){
        for(int i=2;i<n;i++) {
            if (is_prime(i)) {
                System.out.print(i + ", " );
            }
        }
    }


    public static void main(String[] args) {
        int n=50;
        System.out.println(is_prime(n));
        print_primes(n);


    }
}

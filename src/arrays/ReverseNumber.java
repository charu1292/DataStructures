package arrays;

public class ReverseNumber {
    public static int ReverseNumber(int n){
        int revnumber=0;
        while(n>0){
            int lastdigit=n%10;
            n=n/10;
            revnumber=(revnumber*10)+lastdigit;

        }
        return revnumber;
    }

    public static void main(String[] args) {
        int c=ReverseNumber(6432);
        System.out.println(c);
    }

}

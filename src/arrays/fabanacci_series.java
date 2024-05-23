package arrays;

public class fabanacci_series {

    static long a = 0;
    static long b = 1;
    static long c;

    public static void fabanacci_series(int k) {
        for (int i = 1; i < k; i++) {
            long c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    public static long[] fab_long(int k){
        long[] d = new long[k];
        if(k == 1) {
            return d;
        } else {
            d[1] = 1;
            int a = 0;
            int b = 1;
            int c = 0;
            for (int i = 2; i < k; i++) {
                c = a + b;
                d[i] = c;
                a = b;
                b = c;
            }
        }
        return d;
    }

    public static void main(String[] args) {
        int k = 10;
//        System.out.print(a + " " + b + " ");
//        fabanacci_series(k);
//        System.out.print(c + " ");
//        System.out.println();
        long[] result = fab_long(k);
        for (long num : result) {
            System.out.print(num + " ");
        }
    }
}
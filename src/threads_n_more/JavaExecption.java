package threads_n_more;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}


public class JavaExecption {


    public static void unchecked() throws MyException{
        String  s = null;
        if(s == null) {
            throw new MyException("chutiye");
        }
        System.out.println("hello");
    }

    public static void checked() throws IOException, NullPointerException{

        File file = new File(
                "C:\\Users\\pankaj\\Desktop\\test.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);

    }
    public static void fun() {

        try {
            System.out.println("fun starts");
            int[] arr = new int[5];
            arr[8] = 10;
            String s = null;
            s.toLowerCase();
            System.out.println("fun ends");

        }  catch (NullPointerException e) {
            System.out.println("null pointer exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index out of bound");
        } catch (RuntimeException e) {
            System.out.println("runtime exception");
        } catch (Exception e) {
            System.out.println("generic exception");
        } finally {
            System.out.println("inside finally");
        }

    }

    public static void main(String[] args)  {

        try {
            unchecked();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
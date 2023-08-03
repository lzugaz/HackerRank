import java.io.*;
import java.util.*;

public class solveMeFirst {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int a = Integer.parseInt(br.readLine());
            int b =  Integer.parseInt(br.readLine());
            int sum = a + b;
            System.out.println(sum);
        }catch(IOException ioe){
            System.out.println(ioe);
        }
        
    }
}
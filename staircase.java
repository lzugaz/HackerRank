import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
        int spaces = n-1;
        int hashtags = 1;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < spaces; j++){
                System.out.print(" ");
                
            }
            for(int j = 0; j < hashtags; j++){
                System.out.print("#");
                
            }
            System.out.println();
            spaces--;
            hashtags ++;
        }

    }

}

public class staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}

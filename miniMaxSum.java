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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        long minSum = 0;
        long maxSum = 0;
        int minCounter = 0;
        int maxCounter = 0;
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (maxCounter < 4) {
                if (i > 0) {
                    maxSum = maxSum + arr.get(i);
                    maxCounter++;
                }
            }
            if (minCounter < 4) {
                if (i < arr.size() - 1) {
                    minSum = minSum + arr.get(i);
                    minCounter++;
                }
            }
        }
        System.out.println(minSum + " " + maxSum);
    }

}

public class miniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

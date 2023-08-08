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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

   public static String timeConversion(String s) {
    // Write your code here
        
    String hour = s.substring(0, 2);
    int hours = Integer.parseInt(hour);
    String minute = s.substring(3, 5);
    String second = s.substring(6, 8); 
    if (s.contains("PM")){
        if (hours != 12) {
            hours = hours + 12;
        }
        return (hours + ":" + minute + ":" + second);
    } else {
        if (hours == 12){
            return ("00" + ":" + minute + ":" + second);
        }
        return (hour + ":" + minute + ":" + second);
    }
}


}

public class timeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

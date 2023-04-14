import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        Double a = 0.000000, b = 0.000000, c = 0.000000;
        Integer i = 0;
        
       for(Integer val: arr){
           if(val > 0){
               a = a + 1.000000;
           }
           if(val < 0){
               b = b + 1;
           }
           if( val == 0){
               c = c + 1;
           }
           i++;
       }
       String pos = String.format("%.6f", a/i);
       String neg = String.format("%.6f", b/i);
       String zer = String.format("%.6f", c/i);
       System.out.print(pos + "\n");
       System.out.print(neg + "\n");
       System.out.print(zer + "\n");
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

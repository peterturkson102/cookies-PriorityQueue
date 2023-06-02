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
     * Complete the 'cookies' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY A
     */

    public static int cookies(int k, List<Integer> As) {
    // Write your code here
 int count = 0;
 
 PriorityQueue<Integer> A  = new  PriorityQueue<>(As);
 
 while( A.peek() <k){
     if(A.size()==1){
         return -1;
     }
     
     count++;
     
     int first = A.poll();
     int second = A.poll();
     int newNum = (first+2*second);
     
     A.add(newNum);
 }
 
    return count;
    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 
 */
public class FindNUniqueIntegersSumUpToZero {


    /**
     * Given an integer n, return any array containing 
     * n unique integers such that they add up to 0.
     * 
     * 42 / 42 test cases passed.
     * Status: Accepted
     * Runtime: 0 ms
     * Memory Usage: 39.2 MB
     */
    static public int[] sumZero0(int n) {

        // **** initilalization ****
        int[] arr   = new int[n];
        int sum     = 0;

        // **** populate the arr[] - O(n) ****
        for (int i = 0; i < n - 1; i++) {

            // **** populate this entry ****
            arr[i]  = i + 1;

            // **** update the sum ****
            sum     += arr[i];
        }

        // **** set the last entry in arr[] ****
        arr[n - 1] = -sum;

        // **** return arr[] ****
        return arr;
    }


    /**
     * Given an integer n, return any array containing 
     * n unique integers such that they add up to 0.
     * 
     * 42 / 42 test cases passed.
     * Status: Accepted
     * Runtime: 0 ms
     * Memory Usage: 39.1 MB
     */
    static public int[] sumZero(int n) {
        
        // **** initialization ****
        int[] arr = new int[n];

        // **** determine if n is even or odd ****
        boolean even = (n % 2 == 0 ? true : false);

        // **** populate the array - O(n / 2) ****
        for (int i = 0; i < n / 2; i++) {

            // **** fill left cell ****
            arr[i] = (i + 1) * -1;

            // **** fill right cell ****
            arr[i + (n / 2) + (even ? 0 : 1)] = (i + 1);
        }

        // **** return arr[] ****
        return arr;
    }


    /**
     * Test scaffold
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        // **** open buffered reader ****
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // **** ****
        int n = Integer.parseInt(br.readLine().trim());
        
        // **** close buffered reader ****
        br.close();

        // ???? ????
        System.out.println("main <<< n: " + n);

        // **** call function of interest and display result ****
        System.out.println("main <<< output: " + Arrays.toString(sumZero0(n)));

        // **** call function of interest and display result ****
        System.out.println("main <<< output: " + Arrays.toString(sumZero(n)));
    }
}
import java.io.*;
import java.util.*;

public class LargestPosNeg {
    // Java program for the above approach

        // Function to find the largest
        // number k such that both k and
        // -k are present in the array
        public static int largestNum(int[] arr)
        {
            int res = 0;

            // Sort the array arr[]
            Arrays.sort(arr);

            // Initialize two variables to
            // use two pointers technique
            int l = 0, r = arr.length - 1;

            // Iterate until the value of
            // l is less than r
            while (l < r) {

                // Find the value of the sum
                int sum = arr[l] + arr[r];

                // If the sum is 0, then the
                // resultant element is found
                if (sum == 0) {
                    res = Math.max(
                            res, Math.max(
                                    arr[l], arr[r]));

                    return res;
                }

                // If the sum is negative
                else if (sum < 0) {
                    l++;
                }

                // Otherwise, decrement r
                else {
                    r--;
                }
            }

            return res;
        }

        // Driver Code
        public static void main(String[] args)
        {
            int[] arr = { 3, 2, -2, 5, -3 };
            System.out.println(
                    largestNum(arr));
        }
    }

}
/*
Write a function that:
Given an array of integers, find the largest integer such that its value exist positive and negative.
in case none is found -1 should be return.
Example:
Input:[2,6,-2,4,-6,5] output: 6
Input:[2,5,5,3,-6,-5] output: 5
Input:[2,6,3,4,6,5] output: -1
Restrictions:
cannot use build-in sort methods.
*/
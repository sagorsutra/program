package Leetcode;

import java.util.*;


class Main
{
    // Utility function to print the subarray formed by `A[i, j]`
    public static void printSubarray(int[] A, int i, int j, int n)
    {
        if (i < 0 || i > j || j >= n) { // invalid input
            return;
        }

        for (int index = i; index < j; index++) {
            System.out.print(A[index] + ", ");
        }

        System.out.println(A[j]);
    }

    // Function to print all subarrays having distinct elements
    public static void calculate(int[] A)
    {
        int n = A.length;

        // create a map to mark elements as visited in the current window
        Map<Integer, Boolean> visited = new HashMap<>();

        // put all elements on a map
        for (int val: A) {
            visited.put(val, false);
        }

        // points to the left and right boundary of the current window,
        // i.e., the current window is formed by `A[left, right]`
        int right = 0, left = 0;

        // loop until the right index of the current window is less
        // than the maximum index
        while (right < n)
        {
            // keep increasing the window size if all elements in the
            // current window are distinct
            while (right < n && !visited.get(A[right]))
            {
                visited.put(A[right], true);
                right++;
            }

            printSubarray(A, left, right - 1, n);

            // As soon as a duplicate is found (`A[right]`),
            // terminate the above loop, and reduce the window's size
            // from its left to remove the duplicate

            while (right < n && visited.get(A[right]))
            {
                visited.put(A[left], false);
                left++;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] A = { 5, 2, 3, 5, 4, 3 };

        calculate(A);
    }
}


/*
public class subArrayHavingDisntELemnt {
    public static void main(String[] args) {
        int [] arr = {5, 2, 3, 5, 4, 3};

        for (int i=0; i<arr.length; i++) {
            Set<Integer> set = new HashSet<>();

int a ;

            for (int j = i; j < arr.length; j++) {
                if (set.contains(arr[j])) {
                    break;

                } else
                    set.add(arr[j]);
            }
            System.out.println(set);
        }





    }
}

 */
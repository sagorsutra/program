package Leetcode;

import java.util.*;

public class countDistinctValue {
    public static void main(String[] args) {
        int [] arr ={ -1, -1, -1, -1 };


        // Now Without using Hashset

        int count;
        List<Integer>  st =  new ArrayList<>();

        Arrays.sort(arr);

        for (int i=0; i<arr.length; i++){

            if (arr[i]>=0)
            {
                if (arr[i-1] == arr[i])
                {
                    break;
                }
                st.add(arr[i] );
            }
        }

        System.out.println(st);


    }
}


/*
Set<Integer> st = new HashSet<>();
        for (int i : arr)
        {
            st.add(Math.abs(i));
        }

        System.out.println(st);

 */
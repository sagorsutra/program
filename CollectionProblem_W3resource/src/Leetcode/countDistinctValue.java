package Leetcode;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class countDistinctValue {
    public static void main(String[] args) {
        int [] arr = { -2, -1, 0, 1, 2, 3};

        Set<Integer> st = new HashSet<>();
        for (int i : arr)
        {
            st.add(Math.abs(i));
        }

        System.out.println(st);

    }
}

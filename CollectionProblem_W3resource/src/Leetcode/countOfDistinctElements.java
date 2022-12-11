package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class countOfDistinctElements {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 3, 2, 1, 4, 5};
        int k = 5;

        for (int j=0; j<k; j++)
        {
            Set<Integer> set = new HashSet<>() ;
            List<Integer> list = new ArrayList<>();

            for (int i = j; i < k+j; i++) {
                list.add(arr[i]);
                set.add(arr[i]);
            }
            System.out.println(list + "    Number of distinct value is " + set.size());

        }

    }
}

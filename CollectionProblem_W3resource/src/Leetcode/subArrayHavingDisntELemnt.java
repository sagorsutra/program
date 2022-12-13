package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class subArrayHavingDisntELemnt {
    public static void main(String[] args) {
        int [] arr = {5, 2, 3, 5, 4, 3};

        for (int i=0; i<arr.length; i++) {
            Set<Integer> set = new HashSet<>();

            int count =0;

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

package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class subArrayHavingDisntELemnt {
    public static void main(String[] args) {
        int [] arr = {5, 2, 3, 5, 4, 3};

        List<Integer> list = null; 
        
        for (int i=0; i< arr.length; i++)
        {
            for (int j=i; j<arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    list = new ArrayList<>();
                    list.add(arr[j]);
                }
            }
            System.out.println(list);
            
        }




    }
}
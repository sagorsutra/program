package Leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class duplicate_In_Range {

    public static Boolean duplicates(int [] num, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i= 0;i< num.length; i++)
        {
            if (map.containsKey(num[i]))
            {
                if (i-map.get(num[i]) <= k)
                {
                    return true;
                }

            }
            map.put(num[i], i );
        }
        return false;

    }



    public static void main(String[] args) {

        int[] num = { 5, 6, 8, 2, 4, 6, 9 };
        int k = 4;
        try {
            if (duplicates(num,k))
            {
                System.out.println("Found Duplicate");
            }
            else
                System.out.println("Not found");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }

}


/*
That was with the simple array

    public static boolean duplicates(int[] nums, int k)
        {
           for (int i=0; i< nums.length; i++)
            {
            for (int j=i+1; j<=k+i; j++)
             {
                 if (nums[i] == nums[j])
                      return true;
                 }
            }
            return false;
        }
 */
package Leetcode;

import java.util.HashSet;

public class duplicate_In_Range {

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



    public static void main(String[] args) {

        int[] num = {1, 2, 3, 2, 1 };
        int k = 2;
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

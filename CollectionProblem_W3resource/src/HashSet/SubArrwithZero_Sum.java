package HashSet;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class SubArrwithZero_Sum {

    public static  boolean haszeroSumSubqury(int[] num)
    {


        Set<Integer> set = new HashSet<>();

        set.add(0);
        int sum =0;

        for (int value : num)
        {
            sum +=value;

            if (set.contains(sum))
            {
                return true;
            }

            set.add(sum);

        }

           return false;
    }


    public static void main(String[] args) {

        int[] nums = { 4, -6, 3, -1, 4, 2, 7 };

        if (haszeroSumSubqury(nums)) {
            System.out.println("Subarray exists");
        }
        else {
            System.out.println("Subarray does not exist");
        }

    }

}

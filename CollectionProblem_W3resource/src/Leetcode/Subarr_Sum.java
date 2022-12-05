package Leetcode;

import com.sun.source.doctree.SeeTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Subarr_Sum {

    public static Boolean sumsub() {
        int[] num = {2, 6, 0, 9, 7, 3, 1, 4, 1, 10};
        int target = 15;

        Set<Integer> s = new HashSet<>();

        int sum = 0;

        s.add(0);

        for (Integer a : num)
        {

            sum = sum + a;

            if (s.contains(sum - target))
            {
                return true;
            }
            s.add(sum);

        }

        return false;



    }


    public static void main(String[] args) {
        if (sumsub())
        {
            System.out.println("SumSub exist");
        }
        else
            System.out.println("Doesn't Exist");
    }
}

/*  without Hashmap

          int low = 0;
        int high = 0;
        int sum = 0;

        //HashMap<Integer ,Integer> map = new HashMap<>();

        for (int i = 0; i < num.length; i++) {

             while (sum <target && high< num.length)
             {
                 sum = sum + num[high];
                 high++;
             }
             if (sum == target)
             {
                 System.out.printf("[%d - %d]", i, high-1);
                 return;
             }
             sum = sum - num[i];
        }

 */




/* My code of try

  int low = 0;
        int high = 0;
        int sum = 0;

        //HashMap<Integer ,Integer> map = new HashMap<>();

        for (int i = 0; i < num.length; i++) {

            if (sum < target) {
                low = high;            // low-> 0 && high-> 0
                sum = sum + num[high];
                high++;

                if (sum == target)
                {
                    break;
                }
            }
            else if (sum > target) {
                high = low;    //now high will be 0 for track
                high++;       // count from the second one (h->1)
                sum =0;
                //i=high;
            }

 */
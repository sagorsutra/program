package Leetcode;

import java.util.HashMap;

public class Subarr_Sum {

    public static void main(String[] args) {
        int[] num = {2, 6, 0, 9, 7, 3, 1, 4, 1, 10};
        int target = 15;

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


    }
}


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
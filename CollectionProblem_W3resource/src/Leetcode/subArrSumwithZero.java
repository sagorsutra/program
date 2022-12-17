package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class subArrSumwithZero {

  public static  void sumZero(int[] arr)
        {

            int sum =0;
            int count = 0;
            Set<Integer> set = new HashSet<>();

            set.add(0);

            for (int i=0; i< arr.length; i++){
                sum += arr[i];
                if (set.contains(sum))
                {
                    count++;
                }
                set.add(sum);
            }

            System.out.println(count);
            System.out.println(set);

        }

        public static void main(String[] args) {

      int [] arr= {3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

            sumZero(arr);


    }

}

package Leetcode;

import java.util.*;

public class longest_sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int longSum =1;

        for (int i=0; i<arr.length; i++)
        {
            arr[i] = s.nextInt();
        }

        HashMap<Integer,Boolean> map = new HashMap<>();

        for (int val : arr)
        {
            map.put(val,true);
        }

        for (int val : arr)
        {
            if (map.containsKey(val-1))
            {
                map.put(val,false);
            }
        }

        //mentioning the starting point
        for (int val : arr)
        {
            System.out.println(val +" " + map.get(val));
        }

        int max_l = 0;
        int max_sp=0;

        for (int val : arr)
        {
            if (map.get(val) == true){
                int tL =1;
                int tSp = val;
                while (map.containsKey(val+tL))
                {
                    tL++;
                }
                if (tL>max_l)
                {
                    max_l = tL;
                    max_sp = tSp;
                }
            }
        }

        for (int i=0; i<max_l; i++)
        {
            System.out.println();
            System.out.print(max_sp + i + " ");
        }

    }
}

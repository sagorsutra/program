package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Sum_of_triplet {
    public static boolean istriplet_sum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        int b=0;
        int a=1;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int val = target - (arr[i] - arr[j]);
                if (map.containsKey(val)) {
                    if (map.get(val) != i && map.get(val) != j) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
        public static void main (String[]args){
            int[] arr = {2, 7, 4, 0, 9, 5, 1, 3};
            int target = 6;

            if (istriplet_sum(arr,target))
            {
                System.out.println("Triplet Sum Exist" );
            }
            else
                System.out.println("Triplet Sum Doesn't Exist");

        }

    }

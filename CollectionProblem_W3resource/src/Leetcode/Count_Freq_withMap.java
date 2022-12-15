package Leetcode;
import java.util.HashMap;
import java.util.Map;

public class Count_Freq_withMap {
    public static void main(String[] args) {
        int [] arr = {2,2,2,1,1,4,3,4};

         Map<Integer,Integer> map = new HashMap<>();

        for (int i=0; i< arr.length; i++)
        {
             if (map.containsKey(arr[i])) //if the upcoming key already exist in the map
             {
                 map.put(arr[i],map.get(arr[i])+1);  // Then just increase the value of key Values(Count).
             }
             else {
                 map.put(arr[i],1);
             }
        }
        for (Map.Entry e : map.entrySet())
        {
            System.out.println("Frequency of " + e.getKey() + ": " +e.getValue() );
        }

    }
}

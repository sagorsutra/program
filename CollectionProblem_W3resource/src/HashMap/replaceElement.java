package HashMap;

import java.util.*;

public class replaceElement {

    public static void main(String[] args) {
        int[] arr = { 10, 8, 15, 12, 6, 20, 1 };

        Map<Integer,Integer>  map = new TreeMap<>();

        for (int i=0; i<arr.length; i++)
        {
            map.put(arr[i],i );
        }




        int rank = 1;

        System.out.println(map);

        System.out.println(map.values());

            // iterate through the map and replace each element with its rank
        for (var val: map.values()) {
            arr[val] = rank++;
        }

        System.out.println(Arrays.toString(arr));

//        for (Map.Entry s : map.entrySet())
//        {
//            System.out.println(s);
//        }




    }

}

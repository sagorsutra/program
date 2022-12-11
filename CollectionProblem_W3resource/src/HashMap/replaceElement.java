package HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class replaceElement {

    public static void main(String[] args) {
        int[] arr = { 10, 8, 15, 12, 6, 20, 1 };

        Map<Integer,Integer>  map = new TreeMap<>();

        for (int i=0; i<arr.length; i++)
        {
            map.put(arr[i],i );
        }

        int rank =1;

        for (var val : map.values())
        {
            arr[val] = rank++;
        }




    }

}

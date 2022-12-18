package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class surpasser_count {
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 9, 7, 10};
        int c;

        List<Integer> list = new ArrayList<>();

        double value;

        for (int i = 0; i < arr.length; i++){
            int count =0;
            for (int j=i+1; j< arr.length; j++)
            {
                if (arr[i]<arr[j])
                {
                    count++;
                }
            }
            list.add(count);
        }
        System.out.println(list);

    }
}

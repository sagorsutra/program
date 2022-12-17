package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Count_Frequency {

    public static void main(String[] args) {

        int [] arr = {2,2,2,1,1,4,3,4};
        int [] visitedarr= new int[arr.length];
        int visited = -1;      ///Here negative value with variable is for marking

        for(int i=0; i< arr.length; i++)
        {
            int count =1;
            for (int j=i+1; j< arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                    visitedarr[j]=visited;
                }
            }
            if (visitedarr[i]!=visited)
            {
                visitedarr[i] = count;
            }
        }
        for (int i=0; i< arr.length; i++)
        {
            if (visitedarr[i]!=visited)
            {
                System.out.println("Frequency of " +arr[i]  + ": " +visitedarr[i]);
            }
        }
    }
}

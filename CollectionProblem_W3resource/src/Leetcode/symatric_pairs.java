package Leetcode;

import java.util.HashSet;
import java.util.Set;
class Pair{
    public int x;
    public int y;

    Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

public class symatric_pairs {

    public static void Sympair(Pair[] pairs) //Ei constructor a Pair class run korte hobe array hisebe coz we need to input these
    {
        Set<String> set = new HashSet<>();
        for (Pair curr_pair : pairs)
        {
            String p = "{" +curr_pair.x + "," + curr_pair.y + "}";
            set.add(p);
            String rev = "{" +curr_pair.y + "," + curr_pair.x + "}";

            if (set.contains(rev))
            {
                System.out.println(p + "|"+ rev);
            }

        }
    }

    public static void main(String[] args) {
        Pair[] pairs = {
                new Pair(3, 4), new Pair(1, 2), new Pair(5, 2),
                new Pair(7, 10), new Pair(4, 3), new Pair(2, 5)
        };
        Sympair(pairs);
    }

}

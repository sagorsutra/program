package HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();
        set.add("Football");
        set.add("Cricket");
        set.add("Soccer");
        set.add("Kabaddi");
        set.add("Hocky");
        set.add("Swimming");

        HashSet<String> n_set = new HashSet<String>();
        int n;

        n_set = (HashSet<String>) set.clone();

        System.out.println(set);

        System.out.println(n_set);
    }
}



/*      Empty Hashset

        set.removeAll(set);
        System.out.println(set.size());

 */

/*  Iteration

       HashSet<String> set = new HashSet<String>();
        set.add("Football");
        set.add("Cricket");
        set.add("Soccer");
        set.add("Kabaddi");
        set.add("Hocky");
        set.add("Swimming");

        Iterator<String> i = set.iterator();

        while (i.hasNext())
        {
            System.out.println(  );
        }
 */
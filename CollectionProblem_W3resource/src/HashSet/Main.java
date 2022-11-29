package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();
        set.add("Football");
        set.add("Cricket");
        set.add("Soccer");
        set.add("Kabaddi");
        set.add("Swimming");
        set.add("Swimming");
        System.out.println(set);





    }
}




/*
        Common Element of two set

        for (String s : set)
        {
            if (set1.contains(s))
            {
                a.add(s);
            }
        }


        for (String s : a) {

            System.out.println(s);

        }


 */





/*  Compare Hashset

 for (String s : set)
        {
            System.out.println(set1.contains(s)? "Yes" : "No");
        }

 */


/*  Hashset to Array

String[] array = new String[set.size()];
        set.toArray(array);

        for (String s : array)
        {
            System.out.println(s);
        }

 */

/*      Hashset clone

        HashSet<String> n_set = new HashSet<String>();
        int n;

        n_set = (HashSet<String>) set.clone();
        System.out.println(set);
        System.out.println(n_set);
 */


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
package HashMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Sagor");
        hashMap.put(2,"Pollard");
        hashMap.put(3,"Maria");
        hashMap.put(4,"Nolan");
        hashMap.put(5,"Halland");

        System.out.println(hashMap.get(1));



     }
}





/*
 if (hashMap.containsKey(1)){
            System.out.println("yes!" + hashMap.get(1) );
        }
 */




/*
        set view
        Set set = hashMap.entrySet();

        System.out.println(set);
 */



/* clone a HashMap

    HashMap<Integer,String> hash2 = new HashMap<>(hashMap);

        for (Map.Entry m: hash2.entrySet())
        {
            System.out.println(m.getKey() + ": " + m.getValue());
        }

 */


/* init a Hashmap

    HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Sagor");
        hashMap.put(2,"Pollard");
        hashMap.put(3,"Maria");
        hashMap.put(4,"Nolan");
        hashMap.put(5,"Halland");


        boolean result = hashMap.isEmpty();

        System.out.println("Map is empty: " + result);

        hashMap.clear();
        boolean results = hashMap.isEmpty();
        System.out.println("Map is empty: " + results);


 */
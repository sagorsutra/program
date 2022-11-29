package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Sagor");
        hashMap.put(2,"Pollard");
        hashMap.put(3,"Maria");
        hashMap.put(4,"Nolan");
        hashMap.put(5,"Halland");

        hashMap.clear();

        for (Map.Entry m: hashMap.entrySet())
        {
            System.out.println(m.getKey() + " : " + m.getValue());
        }

     }
}

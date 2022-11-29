package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class printHash {
    public static void main(String[] args) {

        HashSet<hashAppend> set = new HashSet<hashAppend>();

        hashAppend h1 = new hashAppend("Akib", 22, "Robotics");
        hashAppend h2 = new hashAppend("Sagor", 25, "Developer");
        hashAppend h3 = new hashAppend("Fahim", 24, "Software");

        set.add(h1);
        set.add(h2);
        set.add(h3);

        for (hashAppend s : set)
        {
            System.out.println(s.name + " " +s.Id + " " + s.Department);
        }

    }
}

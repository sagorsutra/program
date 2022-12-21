package Linked_List;

import java.util.*;

public class w3_question {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(10);
        list.add(3);
        list.add(66);
        list.add(95);
        list.add(50);

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(40);
        list1.add(3);
        list1.add(33);
        list1.add(45);
        list1.add(4);
        list1.add(14);

        ArrayList<String> a = new ArrayList<>();

        for (int e : list)
        {
//            if (list1.contains(e))
//            {
//                a.add("Yes");
//            }
//            else
//            {
//                a.add("No");
//            }
            a.add(list1.contains(e)? "Yes " : "NO");
        }

        Collections.replaceAll(list,4,400);


        System.out.println(list);
        System.out.println(a);
        System.out.println(list.contains(4));


    }
}


/*

     // Element add at the specified positions and get the first and the last element

        System.out.println(list.getFirst() +" " + list.getLast());
        list.add(4,1000000);
        System.out.println(list);



    //Iterate from specified indices

    Iterator p = list.listIterator(1);

        while (p.hasNext())
        {
            System.out.print(p.next()+ "->");
        }




    //Bring the last element of a list->

     for (int i=list.size()-1; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }

 */
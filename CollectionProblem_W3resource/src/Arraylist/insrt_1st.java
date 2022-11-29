package Arraylist;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class insrt_1st {
    public static void main(String[] args) {

            ArrayList<String> c1= new ArrayList<String>();
            c1.add("Red");
            c1.add("Green");
            c1.add("Black");
            c1.add("White");
            c1.add("Pink");

        for (int i=0; i<c1.size(); i++)
        {
            System.out.print(c1.get(i) +" "); // This line is iterate for each value in the list
        }

            c1.set(1,"Blue");
        System.out.println();

            for (int i=0; i<c1.size(); i++)
            {
                System.out.print(c1.get(i) + " ");
            }


        System.out.println();

          System.out.println(c1);

//        Collections.replaceAll(c1,"Red","Blue");

          System.out.println(c1);


    }
}



/*
        join two more list
         ArrayList<String> a= new ArrayList<String>();
        a.addAll(c1);
        a.addAll(c2);

        System.out.println(a);

 */



/*

        swapping two number
        Collections.swap(c1,0,2);


 */



    //Comparing two list

    /*

      //shortcut
      for (String e : c1)
       {
           c3.add(c2.contains(e) ? "Yes" : "No");
       }
        System.out.println(c3);



     ArrayList<String> c3 = new ArrayList<>();

       for (String e : c1)
       {
          if (c2.contains(e))
          {
              c3.add("Yes");
          }
          else
              c3.add("NO");
       }
        System.out.println(c3);

     */



/*

        sublist --> make portion of a list

        List<String> sub_list = arrayList.subList(0,3);

        System.out.println(sub_list);

 */


/*
        reverse a list
        ArrayList<String> secArray = new ArrayList<String>(arrayList);

        System.out.println(secArray+"\n");

        secArray.add("Brown");

        System.out.println(secArray);


 */


        //coping a list  into another list

        /*
            ArrayList<String> secArray = new ArrayList<String>(arrayList);

        System.out.println(secArray+"\n");

        secArray.add("Brown");

        System.out.println(secArray);

         */





        //Checking the word in the list and getting the index number

        /*

        if (arrayList.contains("Green"))
        {
            System.out.println("Yes");
            System.out.println("The index is "+ arrayList.indexOf("Green"));

        }
        else
            System.out.println("No");

         */






        //adding into the index number

        /*

        System.out.println("before adding\n");
        System.out.println(arrayList);

        System.out.println("after adding\n");
        arrayList.add(0,"Gray");
        System.out.println(arrayList);
         */



//updating the index element
        /*
         arrayList.set(2,"Black");

        System.out.println(arrayList);

         */


//Get element from an index
        /*


        System.out.println(arrayList.get(2));

         */

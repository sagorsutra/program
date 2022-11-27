package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class insrt_1st {
    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Black");
        arrayList.add("yellow");
        arrayList.add("Green");
        arrayList.add("Purple");

        System.out.println(arrayList);

        List<String> sub_list = arrayList.subList(0,3);

        System.out.println(sub_list);

    }
}


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

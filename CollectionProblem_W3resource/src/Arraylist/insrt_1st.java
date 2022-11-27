package Arraylist;

import java.util.ArrayList;

public class insrt_1st {
    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Black");
        arrayList.add("yellow");
        arrayList.add("Green");
        arrayList.add("Purple");


        if (arrayList.contains("Green"))
        {
            System.out.println("Yes");
            System.out.println("The index is "+ arrayList.indexOf("Green"));

        }
        else
            System.out.println("No");






    }
}




        /*
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Green");
        arrayList.add("yellow");
        arrayList.add("Green");
        arrayList.add("Purple");

        System.out.println("before adding\n");
        System.out.println(arrayList);

        System.out.println("after adding\n");
        arrayList.add(0,"Gray");
        System.out.println(arrayList);
         */



//updating the index element
        /*

         ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Green");
        arrayList.add("yellow");
        arrayList.add("Green");
        arrayList.add("Purple");

         arrayList.set(2,"Black");

        System.out.println(arrayList);

         */


//Get element from an index
        /*
         ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Green");
        arrayList.add("yellow");
        arrayList.add("Green");
        arrayList.add("Purple");

        System.out.println(arrayList.get(2));

         */

package Arraylist;

import java.util.ArrayList;

public class insrt_1st {
    public static void main(String[] args) {

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


    }
}

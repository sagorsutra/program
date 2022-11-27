package Arraylist;

import java.util.ArrayList;

public class printList {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Red");
        arrayList.add("Green");
        arrayList.add("yellow");
        arrayList.add("Green");
        arrayList.add("Purple");

        for (String s : arrayList)
        {
            System.out.println(s);
        }

    }

}

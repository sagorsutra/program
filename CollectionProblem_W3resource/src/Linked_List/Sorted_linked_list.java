package Linked_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorted_linked_list {

    Node head;
    class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void insertlast(int data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head=newNode;
        }
        else if (head.next==null)
        {
            head.next = newNode;
        }
        else
        {
            Node currnode = head;
            while (currnode.next!= null)
            {
                currnode = currnode.next;
            }
            currnode.next = newNode;
        }

    }

    public void Sorted_List()
    {

        Node curr = head;
        int count0=0;
        int count1=0;
        int count2=0;

        while(curr!=null)
        {
            if (curr.data==0)
            {
                count0++;
            }
            else if (curr.data==1) {
                count1++;
            }
            else
            {
                count2++;
            }
        }

        while(count0>0)
        {
            curr.data=0;
            curr=curr.next ;
            count0--;
        }
        while(count1>0)
        {
            curr.data=1;
            curr=curr.next ;
            count1--;
        }
        while(count2>0)
        {
            curr.data=2;
            curr=curr.next ;
            count2--;
        }

        while (curr.next!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }

//        Node currNode = head;
//
//        ArrayList<Integer> arr = new ArrayList<>();
//        while (currNode!=null)
//        {
//            arr.add(currNode.data);
//            currNode = currNode.next;
//        }
//
//        Collections.sort(arr);
//
//        for (int a : arr)
//        {
//            System.out.print(a + " ");
//        }

    }


    public void printList()
    {
        Node currNode = head;
        while (currNode!= null)
        {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
    }


    public static void main(String[] args) {
        Sorted_linked_list ll = new Sorted_linked_list();
        ll.insertlast(1);
        ll.insertlast(2);
        ll.insertlast(2);
        ll.insertlast(1);
        ll.insertlast(2);
        ll.insertlast(0);
        ll.insertlast(2);
        ll.insertlast(2);

        ll.printList();
        System.out.println();
        ll.Sorted_List();



    }
}

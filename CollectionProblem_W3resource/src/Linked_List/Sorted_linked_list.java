package Linked_List;

import java.util.ArrayList;

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
        Node currNode = head;

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(currNode.data);
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
        ll.insertlast(30);
        ll.insertlast(99);
        ll.insertlast(25);
        ll.Sorted_List();
        ll.printList();



    }
}

package Linked_List;

import jdk.swing.interop.SwingInterOpUtils;

public class Secnd_node_frm_end {
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


    public void addFirst(int data)
    {
         Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
            return;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data)
    {
      Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
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

    public void Second_last_Node()
    {
        Node temp = head;
        Node temp1 =head;
        int count =0;
        int n =2;

        while (temp!= null)
        {
            count++;
            temp = temp.next;

        }

        if (n>count)
        {
            System.out.println(-1);
        }
        else
        {
            count = count-n;
            for (int i=0; i<count; i++)
            {
                temp1= temp1.next;
            }
            System.out.println();
            System.out.println(temp1.data);
        }


//        System.out.println();
//        Node currNode = head;
//        while (currNode.next.next!=null)
//        {
//            currNode = currNode.next;
//        }
//        System.out.println(currNode.data);
    }


    public void Printlist()
    {
        Node currnode = head;
        if(head== null)
        {
            System.out.println("List is empty");
            return;
        }
        while (currnode!= null)
        {
            System.out.print(currnode.data + "->");
            currnode = currnode.next;
        }
    }

    public static void main(String[] args) {
        Secnd_node_frm_end list = new Secnd_node_frm_end();
        list.addFirst(7);
        list.addFirst(99);
        list.addFirst(54);
        list.addLast(65);
        list.addLast(15);
        list.addLast(30);
        list.Printlist();
        list.Second_last_Node();

    }

}

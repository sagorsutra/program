package Linked_List;
import java.io.*;
import java.util.*;

class intersection_of_list
{
    static Scanner sc = new Scanner(System.in);
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;

        val = sc.nextInt();

        head = tail = new Node(val);

        size--;

        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        return head;
    }

    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String args[])
    {

        int t = sc.nextInt();
        while(t-->0)
        {
            int n , m;

            n = sc.nextInt();
            m = sc.nextInt();

            Node head1 = inputList(n);
            Node head2 = inputList(m);

            Solt obj = new Solt();

            Node result = obj.findIntersection(head1, head2);

            printList(result);
            System.out.println();
        }
    }
}
class Solt
{
    public static Node findIntersection(Node head1, Node head2)
    {

        Node l1 = head1;
        Node l2 = head2;

        Node dummy = new Node(0);
        Node temp = dummy;

        while (l1!=null && l2!=null)
        {
            if (l1.data == l2.data)
            {
                temp.next = new Node(l1.data);
                l1 = l1.next;
                l2 = l2.next;
                temp = temp.next;
            }
            else if (l1.data< l2.data) {
                l1 = l1.next;
            }
            else{
                l2 = l2.next;
            }

        }
        return dummy.next;

        /*
          // return the head of intersection list
        Node nh=null;
        Node nl=nh;
        Node h2=head2;
        Map<Integer, Integer> m=new HashMap<>();

        while(h2!=null)
        {
            m.put(h2.data, 1);
            h2=h2.next;
        }

        Node h1=head1;
        while(h1!=null)
        {
            if(m.containsKey(h1.data) && m.get(h1.data)==1)
            {
                m.put(h1.data, m.get(h1.data)+1);
                Node temp=new Node(h1.data);      //Everytime i have to create a new node to store for making a list of intersecting values of two list

                //---> node created now it's time to store another node and create a list
                if(nh==null)
                {
                    nh=temp;
                    nl=nh;
                }
                else
                {
                    nl.next=temp;
                    nl=temp;
                }
            }
            h1=h1.next;
        }
        Node dummy=new Node(0);
        Node temp=dummy;
        return nh;

         */


        /*

        Node l1=head1;
        Node l2=head2;

        Node dummy=new Node(0);
        Node temp=dummy;

        while(l1!=null && l2!=null){

        if(l1.data==l2.data){

            temp.next=new Node(l1.data);

            l1=l1.next;
            l2=l2.next;
            temp=temp.next;

        }
        else if(l1.data<l2.data){
             l1=l1.next;
        }
        else{
            l2=l2.next;
          }
        }

        return dummy.next;
         */

    }
}
package Linked_List;
import java.util.*;
import java.lang.*;
import java.io.*;



//{ Driver Code Starts
//Initial Template for Java



class Driverclass
{

    public static void printList(Node head)
    {
        if(head == null)
            return;

        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for (int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Sort_form s = new Sort_form();
            head =s.segregate(head);
            printList(head);

            t--;
        }
    }
}

class Sort_form
{
    //Function to sort a linked list of 0s, 1s and 2s.
     Node segregate(Node head)
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
            curr = curr.next;
        }
        curr = head;

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

        return head;
    }
}




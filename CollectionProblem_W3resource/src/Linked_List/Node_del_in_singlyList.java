package Linked_List;


//{ Driver Code Starts
import java.util.*;

class Node_del_in_singlyList
{
    Node head;
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void addToTheLast(Node node)
    {
        if (head == null)
        {
            head = node;
        } else
        {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }}
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();

        while(t>0)
        {
            int n = sc.nextInt();
            //int k = sc.nextInt();
            Node_del_in_singlyList llist = new Node_del_in_singlyList();
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }
            int x = sc.nextInt();
            //System.out.println(llist.head.data);
            Gf g = new Gf();
            //System.out.println(k);
            //System.out.println(g.getNthFromLast(llist.head,k));
            Node result = g.deleteNode(llist.head, x);
            llist.printList(result);
            t--;
        }
    }
}
class Gf
{
    Node deleteNode(Node head, int x)
    {

        int idx = 1;
        if(x == 1) {
            return head.next;
        }

        Node top = head;
        Node prev = null;
        while(head != null || idx < x){
            if(idx == x) {
                prev.next = head.next;
                head = prev;
                break;
            }
            prev = head;
            head = head.next;
            idx++;
        }

        return top;



        //This code only work for 50 query

//        Node prev = null;
//
//        if (head == null)
//        {
//            return head;
//        }
//         Node curr = head;
//         for (int i=0; i<x-1; i++)  // if x =2 ,0
//         {
//             prev = curr;
//             curr = curr.next;
//         }
//         if (head.next.next==null)
//         {
//             head.next =null;
//         }
//         else {
//             if (curr.next ==null && x>0)
//             {
//                 prev.next =null;
//             } else if (x==1 && curr.next==null) {
//                 head.next = null;
//             } else
//             {
//                 curr.data = curr.next.data;
//                 curr.next = curr.next.next;
//             }
//
     //   return head;
//         }

    }
}

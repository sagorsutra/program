package Linked_List;
import java.util.*;
        import java.io.*;
        import java.lang.*;


class GG
{
    public static void makeLoop(Node head, Node tail, int x){
        if (x == 0) return;

        Node curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;

        tail.next = curr;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t--> 0)
        {
            int n = sc.nextInt();

            int num = sc.nextInt();
            Node head = new Node(num);
            Node tail = head;

            for(int i=0; i<n-1; i++)
            {
                num = sc.nextInt();
                tail.next = new Node(num);
                tail = tail.next;
            }

            int pos = sc.nextInt();
            makeLoop(head, tail, pos);

            List_loop x = new List_loop();
            System.out.println( x.countNodesinLoop(head));
        }
    }
}

class List_loop
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
         HashMap<Node,Integer> map = new HashMap<>();
         int count=0;
         while(head!=null)
         {
             if (map.containsKey(head))
             {
                 int value = map.get(head);
                 return (count) - value;
             }
             map.put(head,count++);
             head = head.next;
         }
         return 0;
    }
}

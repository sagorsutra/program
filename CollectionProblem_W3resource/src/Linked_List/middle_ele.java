package Linked_List;

//{ Driver Code Starts
import java.util.*;
        import java.io.*;


class middle_ele{
    static void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solutions g = new Solutions();
            int ans = g.getMiddle(head);
            System.out.println(ans);
            //printList(head);
            t--;
        }
    }
}

// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solutions
{
    int getMiddle(Node head)
    {
        Node curr = head;
        int count =0;
        if(head == null)
        {
            System.out.println("No element");
        }
        else if (head.next == null)
        {
            return head.data;
        }

        while(curr!=null)
        {
            count++;
            curr = curr.next;
        }
        Node temp = head;
        int middle= count/2;
       for (int i=0; i<middle; i++)
       {
           temp= temp.next;
       }
       return temp.data;


    }
}

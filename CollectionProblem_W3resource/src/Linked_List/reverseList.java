package Linked_List;

import java.util.Scanner;

public class reverseList {

    static void print(Node node)
    {
        while(node!=null)
        {
            if (node.next==null)
            {
                System.out.println(node.data);
            }else
            {
                System.out.print(node.data + "->");
            }


            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){

            int n = sc.nextInt();

            Node head = new Node(sc.nextInt());
            Node tail = head;

            for (int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }

            reverse rv = new reverse();
            head = rv.list(head);
            print(head);
            t--;

        }
    }
}
class reverse{
    Node list (Node head)
    {
         Node currNode = head;
         Node prevNode = null;

        while (currNode!=null)
        {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
        return head;
    }
}

package Linked_List;
import java.util.*;
        import java.io.*;



class pairwise_swap{
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
            HashMap<Node, Integer> mp = new HashMap<Node, Integer>();
            mp.put(head, head.data);
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
                mp.put(tail, tail.data);
            }

            Node failure = new Node(-1);

            Solut  g = new Solut ();
            head = g.pairwiseSwap(head);

            Node temp = head;
            int f = 0;
            while (temp != null)
            {
                if(mp.get(temp) != temp.data){
                    f = 1;
                }
                temp = temp.next;
            }

            if(f==1){
                printList(failure);
            }
            else{
                printList(head);
            }
            t--;
        }
    }
}

class Solut{
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {

         Node temp = new Node(0);
         temp.next = head;   // here creating the link with the given list


         Node curr = temp;  //curr diye operation calabo (dynamically) but in the end excution hobe temp diye(fixed in place)

         while (curr.next!=null && curr.next.next!= null)
         {
             Node first = curr.next;
             Node second = curr.next.next;
             first.next = second.next;
             curr.next = second;
             curr.next.next = first;
             curr = curr.next.next;
         }
         return  temp.next;


        /*
        Node temp = new Node(0);
        Node curr = head;
        Node next = curr.next;

        ---> first of all eikhane ami link up er concept use kori nai
        ---> linked list a value swap bolte kichui nai, node er link gulo link-up korte hobe (swap)


        while (curr.next.next!=null)
        {
            temp = curr;
            curr = next;
            next = temp;
            curr = curr.next.next;
            next = next.next;
        }
        return  head;


         */

    }
}
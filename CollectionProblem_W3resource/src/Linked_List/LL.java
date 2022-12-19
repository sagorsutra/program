package Linked_List;

public class LL {

    Node head; //Present Node is the head of the linked list

    class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void First_insert(int data)
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

    public void insert_Last(int data)
    {
        Node newNode = new Node(data);

        if (head==null)
        {
            newNode = head;
        }

        Node currNode = head;

        while (currNode.next!= null)
        {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    public void printList()
    {
        if (head==null)
        {
            System.out.println("Empty list");
        }
        else{

            Node currNode = head;
            while (currNode!= null)
            {
                System.out.print(currNode.data + "->");
                currNode = currNode.next;
            }
        }
    }


    public static void main(String[] args) {
        LL list = new LL();
        list.First_insert(45);
        list.First_insert(89);
        list.insert_Last(90);
        list.First_insert(10);
        list.First_insert(5);
        list.insert_Last(100);
        list.printList();


    }


}

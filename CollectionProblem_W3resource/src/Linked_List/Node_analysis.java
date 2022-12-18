package Linked_List;

public class Node_analysis {

    Node head;

    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }


    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            newNode = head;
        }
        else
            newNode.next = head;
            head = newNode;

    }

    public void addLast(String data)
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


    public void PrintList()
    {

    }


    public static void main(String[] args) {
        Node_analysis ll = new Node_analysis();
    }


}

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
            head = newNode;
            return;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
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
        Node_analysis list = new Node_analysis();
        list.addFirst("aa");
        list.addFirst("is ");
        list.addFirst("Machine");
        list.PrintList();

    }


}

package Linked_List;


//{ Driver Code Starts
import java.util.*;

class StackNode {
    int data;
    StackNode next;
    StackNode(int a) {
        data = a;
        next = null;
    }
}

class Stack {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        MyStack obj = new MyStack();//--> How many operation we want
        while (t > 0) {
            int Q = sc.nextInt();      //--> how many Query in a operation
            while (Q > 0) {
                int QueryType = 0;
                QueryType = sc.nextInt();
                if (QueryType == 1) {
                    int a = sc.nextInt();
                    obj.push(a);
                } else if (QueryType == 2) {
                    System.out.print(obj.pop() + " ");
                }
                Q--;
            }
            System.out.println("");
            t--;
        }
        obj.Print();

    }
}

// } Driver Code Ends


class MyStack
{
    StackNode top;

    //Function to push an integer into the stack.
    void push(int a)
    {
       StackNode pushNode = new StackNode(a);

       if (top==null)
       {
           top = pushNode;
       }
       else  {
           top.next = pushNode;
           top = pushNode;
       }

       /*
       while(curr.next!=null)
           {
               curr = curr.next;
           }
           curr.next = pushNode;
           pushNode.next= null;
        */
    }

    //Function to remove an item from top of the stack.
    int pop()
    {
         if (top== null)
         {
             return  -1;
         }
         else {
               int  n = top.data;
               top = top.next;
               return n;
         }
         /*
         while (curr.next.next!=null)
             {
                 curr = curr.next;
             }
             curr.next = null;
          */
    }

    void Print() {
        StackNode cur = top;
        while(cur!=null){
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
        System.out.println();

    }

}

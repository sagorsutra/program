package Linked_List;

 import java.util.*;


class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        int count = 0;
        Node curr = head;

        while (curr!=null)
        {
            count++;
            curr = curr.next;
        }
       return count;
    }
}

//{ Driver Code Starts.
class count_n_list{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }

            Solution ob = new Solution();
            System.out.println(ob.getCount(head));
        }
    }




}


// } Driver Code Ends

/*
 if(head==null)
	       {
	           return false;
	       }
	       else
	       {
	           Node curr = head;
	           while(curr!=null)
	           {
	               curr = curr.next;
	           }
	            curr = curr.next;
	            if(curr== head)
	            {
	                return true;
	            }
	       }
	       retun false;
 */
public class Recursion_basic {

    public static void print(int x, int n)
    {
        if (x==n+1)
        {
            return;
        }
        System.out.println(x);
        print(x+1,n);
    }


    public static void main(String[] args) {
        int n = 5;
        print(1,5);
    }

}


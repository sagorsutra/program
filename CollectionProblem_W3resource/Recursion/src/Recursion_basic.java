public class Recursion_basic {

    public static int factorial(int n)
    {
        if (n==0 || n==1 )
        {
            return 1;
        }

        int fact = factorial(n-1);
        int facto = n * fact;
        return facto;
    }

    public static void main(String[] args) {

        int fact = factorial(5);
        System.out.println(fact);

    }

}

/*
      ---> Print SUM

 public static void  Printsum(int i,int n, int sum)
    {

        if (i==n)
        {
            sum = sum +i;  // Last Sum with last element
            System.out.println(sum);
            return;
        }

        sum += i;           // Initial Sum;
        Printsum(i+1,n,sum);
    }

    public static void main(String[] args) {
        Printsum(1,5,0);

    }





      ---> Number printing

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



 */


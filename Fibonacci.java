class Fibonacci
{
    public static void main(String args[])
    {
        int n=10;

        int a = 0;
        int b = 1;
        int c=0;

        while(c<n)
        {
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
        }

    }
}

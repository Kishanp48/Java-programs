class Factorial
{
    public static void main(String args[])
    {
        int fact = 1;
        int no = 5;

        for (int i=1;i<=no;i++)
        {
            fact *=i;
        }

        System.out.println("factorial is: "+fact);
    }
}
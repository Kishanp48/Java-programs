class Prog_Thread extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
    }

    public static void main(String args[])
    {
        Prog_Thread obj1 = new Prog_Thread();

        obj1.start();
    }
}
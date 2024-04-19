class Prog_Runnable implements Runnable
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);
        }
    }

    public static void main(String args[])
    {
        Prog_Runnable obj = new Prog_Runnable();

        Thread t = new Thread(obj);

        t.start();
    }
}
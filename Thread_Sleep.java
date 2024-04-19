public class Thread_Sleep extends Thread
{
    public void run()
    {
        String str = Thread.currentThread().getName();

        try
        {
            for (int i=0;i<=3;i++)
            {
                System.out.println(str);

                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {

        }
    }

    public static void main(String[] args)
    {
        
        Thread_Sleep t1 = new Thread_Sleep();
        Thread_Sleep t2 = new Thread_Sleep();
        Thread_Sleep t3 = new Thread_Sleep();

        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");

        t1.start();
        t2.start();
        t3.start();
    }
}

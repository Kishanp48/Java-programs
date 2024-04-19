public class Thread_Join extends Thread
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
        
        Thread_Join t1 = new Thread_Join();
        Thread_Join t2 = new Thread_Join();
        Thread_Join t3 = new Thread_Join();

        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");

        t2.start();
        try
        {
            t2.join();
        }
        catch(InterruptedException e)
        {

        }
        t1.start();
        t3.start();


    }    
}

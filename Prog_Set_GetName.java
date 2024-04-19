public class Prog_Set_GetName extends Thread
{

    public void run()
    {

        String str = Thread.currentThread().getName();

        for (int i=0;i<=3;i++)
        {
            System.out.println(str);
        }
    }

    public static void main(String[] args)
    {
        
        Prog_Set_GetName t1 = new Prog_Set_GetName();
        Prog_Set_GetName t2 = new Prog_Set_GetName();
        Prog_Set_GetName t3 = new Prog_Set_GetName();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}

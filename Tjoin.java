class MyThread extends Thread
{
    public void run()
    {
        String name = Thread.currentThread().getName();
        
            for(int i=1; i<=10;i++)
            {
                System.out.println(name+" "+i);
                try
                {
                    Thread.sleep(1000);
                }
                catch(Exception e)
                {

                }
            }
    }
}


class Tjoin
{
    public static void main(String[] args) throws Exception {
        

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("hey 1");
        t2.setName("hey 2");

        t1.start();
        t1.join();
        t2.start();

    }
}
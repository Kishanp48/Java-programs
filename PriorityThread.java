class PriorityThread extends Thread
{
	public void run()
    	{
       		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	
		    // System.out.println(Thread.currentThread().getPriority());
    	}

    
   	public static void main(String args[])
	{
	
		PriorityThread t1 = new PriorityThread();
		PriorityThread t2 = new PriorityThread();
		PriorityThread t3 = new PriorityThread();

	
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");


		t1.setPriority(7);
		t2.setPriority(1);
		t3.setPriority(10);

		t1.start();
		t2.start();
		t3.start();

    }

}

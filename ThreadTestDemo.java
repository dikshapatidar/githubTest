public class MyRunnable  implements Runnable
{
public void run()
{
	for(int i=0;i<=10;i++)
	{
		System.out.println("child  .............thread");
		
		
	}
	System.out.println(Thread.currentThread().getName());
}
}
class ThreadTestDemo
{
	public static void main(String[]ars)
	{
		MyRunnable r=new MyRunnable();
	//r.run();
	
		
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("main thread");
		}
		Thread.currentThread().setName("diksha");
		System.out.println(Thread.currentThread().getName());
}
}
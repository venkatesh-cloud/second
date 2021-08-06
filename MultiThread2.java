class Mythread3 implements Runnable
{
	
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println("Hello thread1");
		}
	}
}
class Mythread4 implements Runnable
{
	
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println("Hello thread2");
		}
	}
}
public class MultiThread2 {
	public static void main(String[] args)
	{
		Mythread3 t1=new Mythread3();
		Thread d1=new Thread(t1);
		Mythread4 t2=new Mythread4();
		Thread d2=new Thread(t2);
		d1.start();
		d2.start();
	}

}

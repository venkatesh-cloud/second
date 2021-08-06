class Mythread1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println("Hello thread1");
		}
	}
}
class Mythread2 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println("Hello thread2");
		}
	}
}
public class MultiThread {
public static void main(String[] args)
{
	Mythread1 t1=new Mythread1();
	Mythread2 t2=new Mythread2();
	t1.start();
	t2.start();
	
}
}

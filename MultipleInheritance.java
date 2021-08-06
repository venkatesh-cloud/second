interface A
{
	void display();
}
interface B
{
	void display();
	int calculate(int a,int b);
}
class C implements A,B
{
	public void display()//should be public as inherited and for visibility
	{
		System.out.println("displaying the calculation");
	}
	public int calculate(int a,int b)
	{
		return a+b;
	}
}
public class MultipleInheritance {
	public static void main(String[] args)
	{
		C c=new C();
		c.display();
		int result=c.calculate(5, 6);
		System.out.println(result);
		
		
	}

}

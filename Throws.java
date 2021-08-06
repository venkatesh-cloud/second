import java.util.*;
public class Throws {
	public static void main(String[] args)
	{
	int i=89;
	int z;
	Scanner sc=new Scanner(System.in);
	int l=sc.nextInt();
	if(l==0)
	{
		try
		{
		throw new ArithmeticException("can not divide by zero");
		}
		catch(Exception e)
		{
		System.out.println("Exception handled")	;
		}
	}
	else
	{
		z=i/l;
		
		System.out.println(z);
	}
	}

}

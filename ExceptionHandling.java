import java.util.*;
public class ExceptionHandling {
	public static void main(String[] args)
	{
		int i=89;
		int z;
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		try
		{
		z=i/l;
		System.out.println(z);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("The end");
		}
	}

}

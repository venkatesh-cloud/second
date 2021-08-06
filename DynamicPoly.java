class School
	{ 
		String stu_id="FE889";
	    int stu_fee=26000;
		 void display()
		{
			System.out.println("The id of the person is "+stu_id+" and fee is "+stu_fee);
		}
	}
	class Student extends School
	{
		String stu_id="FE857";
	     void display()
			{
	    	 System.out.println("The id of the person is "+stu_id+" and fee is "+stu_fee);
			}
		
	}
	public class DynamicPoly{
	public static void main(String[] args)
	{
		School s2,s1;
		s2=new School();
		s2.display();		
		s1=new Student();
		s1.display();
	}
	}



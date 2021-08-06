class Person
{
	String id,name;
	Person(String id, String name)
	{
		this.id=id;
		this.name=name;
	}
}
class Emp extends Person
{
	int Salary;
	Emp(String id,String name,int Salary)
	{
		super(id,name);
		this.Salary=Salary;
		
	}
	void display()
	{
		System.out.println("Name of person is "+name+" and his id is "+id+" and salary is "+Salary);
	}
	
}
public class ThisSuper {
	public static void main(String[] args)
	{
		Emp e1=new Emp("lk123","venkatesh",23000);
		e1.display();
	}

}

class Bank
{
	private String Name;
	private long Acc_no;
	public String getName()
	{
		return Name;
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public long getAcc_no()
	{
		return Acc_no;
	}
	public void setAcc_no(long Acc_no)
	{
		this.Acc_no=Acc_no;
	}
}
public class SetGet {
	public static void main(String[] args)
	{
	Bank b=new Bank();
	b.setName("venkatesh");
	b.setAcc_no(156389733);
	
	System.out.println("Name is Venkatesh and "+b.getName()+" accountno is " +b.getAcc_no());
	}
}

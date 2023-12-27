//wap to create bank interface having method rateofInterest

interface Bank
{
	
	void rateofInterest();
	
}
class SBI implements Bank
{
	public void rateofInterest()
	{
		System.out.println("SBI rate Of Interest is 3.50%:");
	}
}
class HDFC implements Bank
{
	public void rateofInterest()
	{
		System.out.println("HDFC rate Of Interest is 3.50%:");
	}
}
class check
{
	public static void main(String args[])
	{
		Bank b=new SBI();
		b.rateofInterest();

		Bank b2 = new HDFC();
		b2.rateofInterest();
	}
}

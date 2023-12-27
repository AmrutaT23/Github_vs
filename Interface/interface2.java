//multiple interface using interface

interface Bank
{
	void rateofInterest();
	default void A()
	{
		System.out.println("hello");

	}
	int x=10;

	
}
interface Bank1
{
	void rateofInterest1();
	default void B()
	{
		System.out.println("hello");

	}
	

	
}
class SBI implements Bank,Bank1
{
	public void rateofInterest()
	{
		System.out.println("SBI rate Of Interest is 3.50%:");
		System.out.println(x);
	}
	public void rateofInterest1()
	{
		System.out.println("SBI rate Of Interest is 3.00%:");
		System.out.println(x);
	}
}

class check
{
	public static void main(String args[])
	{
		SBI b=new SBI();
		b.rateofInterest();
		b.rateofInterest1();
		b.A();
		b.B();
	}
}

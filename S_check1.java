//Write a program to check whether the number is even or odd using switch ststement.
class S_check1
{
	int N =2;
	
	void check()
	{
		
		switch(N%2)
		{
			case 0: System.out.println("Even Number");
				  break;
			case 1: System.out.println("Odd Number");
				  break;
			default :System.out.println("Invalid Input");
		}
	}
public static void main(String args[])
{
	S_check1 c =new S_check1();
	c.check(); 	
}
}	

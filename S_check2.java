//Write a program to read gender(M/F) and print the corresponding gender using a switch statement.

class S_check2
{
	char gender ='M';
	
	void check()
	{
		
		switch(gender)
		{
			case 'M': System.out.println("MALE");
				  break;
			case 'F': System.out.println("FEMALE");
				  break;
			default :System.out.println("Invalid Input");
		}
	}
public static void main(String args[])
{
	S_check2 c =new S_check2();
	c.check(); 	
}
}	
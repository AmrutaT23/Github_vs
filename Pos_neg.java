/*Input a number and check whether it is positive or negative if it is positive then calculate factorial and 
  if it is negative then convert it into positive number*/

import java.util.Scanner;
class Pos_neg
{
	void check(int n)
	{
		int fact =1;
		if(n>=0)
		{
			System.out.println("Positive Number");
			 for(int i=1; i<=n; i++)
	  		{
				 fact =fact * i;
	  		}
	  		System.out.println("Factorial of a given number is:"+fact);
		}
		else
		{
			System.out.println("Negative Number");
			int con = n*(-1);
			System.out.println(n +" is convert into positive number "+con);
		}
	}
public static void main(String args[])
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number : ");
	int n =sc.nextInt();
	Pos_neg c = new Pos_neg();
	c.check(n); 
}
}
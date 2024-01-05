// Write a program that prompts the user to input a positive integer.It should then output a message indicating whether the number is a prime number.

import java.util.Scanner;
class Prime
{
	int a=1;
	void check(int n)
	{
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				a=0;
			}
		}
		if(a==1)
		{
			System.out.println("It is a prime number");
		}
		else if	(a==0)
		{
			System.out.println("It is not a prime number");
		}
	}
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a positive number : ");
	int n =sc.nextInt();
	Prime p = new Prime();
	p.check(n); 	
}
}	
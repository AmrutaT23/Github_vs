// Write a program  to find the factorial value of any number entered through the keyboard.

import java.util.Scanner;
class P1_fac
{
	int fact =1;
	void cal(int n)
	{
	  for(int i=1; i<=n; i++)
	  {
		fact =fact * i;
	  }
	}
	void result()
	{
		System.out.println("Factorial of a given number is:"+fact);
	}

public static void main(String args[])
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number : ");
	int n =sc.nextInt();
	P1_fac f = new P1_fac();
	f.cal(n); 
	f.result();
}
}
		
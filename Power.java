//Two number are entered through the keyboard the keyboard.Write a program to find the value of one number raised to the power of another.

import java.util.Scanner;
class Power
{
	int pow =1;
	void cal(int n1, int n2)
	{
		for(int i=1; i<=n1; i++)
		{
			pow = pow*n2;
		}
		System.out.println(n2+"^"+n1 + " is :"+pow);
	}
public static void main(String args[])
{
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a raised power : ");
	int N1 =sc.nextInt();
	System.out.println("Enter a number : ");
	int N2 =sc.nextInt();
        Power p = new Power();
	p.cal(N1,N2);
}
}
 	
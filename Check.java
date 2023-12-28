/*Check number is Even or Odd */
import java.util.Scanner;
class Check
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		double number =sc.nextDouble();
		
		if(number%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}
}
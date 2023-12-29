//Write a program to menu driven program using switch statement (find addition ,subtraction,multiplication,division)
import java.util.Scanner;
class S_check4
{
public static void main(String args[])
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Menu :" );
	System.out.println("1 . Add two numbers" );
	System.out.println("2 . Exit " );
	System.out.println("Enter Your Choice 1 or 2");
	int ch1 = sc.nextInt();

	switch(ch1)
		{
			case 1:System.out.println("Enter First Number");
				int A =sc.nextInt();
				System.out.println("Enter Second Number");
				int B =sc.nextInt();
				int sum = A + B;
				System.out.println("Addition is : "+ sum);
				break;
			case 2: System.out.println("Exit Program");
				break;
			default :System.out.println("Invalid Input");
		}
	
	
	
	
}
}

	
	
	
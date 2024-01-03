import java.util.Scanner;

class I_fibo
{
	int num1 = 0, num2 = 1;
 	int counter = 0;
}

class Fibo extends I_fibo
{
	
	 void fibo(int N)
    	{
        	
		while (counter < N) 
		{
			System.out.print(num1 + " ");
 			int num3 = num2 + num1;
            		num1 = num2;
            		num2 = num3;
            		counter = counter + 1;
		}
    	}
 
public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter a  number : ");
	int n =sc.nextInt();
	Fibo f = new Fibo();
	f.fibo(n); 
        
    }
}
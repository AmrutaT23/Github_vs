//Write a program that promots the user to input a positive integer.It should then print the multiplication table of that number.


class P1_mul
{
	int sum;
	void cal(int n)
	{
	   for(int i=1; i<=10;i++)
	   {
		 sum =n * i;
		System.out.println(n+"*"+i+"="+sum);
	   }
	}
public static void main(String args[])
{
	P1_mul t = new P1_mul();
	t.cal(10); 
}
}
	
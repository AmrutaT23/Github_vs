package Java;

public class Factorial {

//	public static void main(String[] args) {
//		int sum=1;
//		int num=6;
//		for(int i=1;i<=num;i++)
//		{
//			sum=sum*i;
//		}
//		System.out.println("Factorial is:"+sum);
//
//	}
	
	//Using Recursion
	int sum=1;
	public  int calculate(int num) 
	{
		if(num == 0)
		{
			return sum;
		}
		else {
			 sum =num*calculate(num-1);
			return sum;
		}
			 
		
	}
	public static void main(String[] args) 
	{
		Factorial f =new Factorial();
		
		System.out.println("Factorial is:"+f.calculate(5));
	}
	

}

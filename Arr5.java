//Check positive or negative

class Arr5
{
	
	public static void main(String args[])
	{
		int a=0;
		int b=0;
		int x[]=new int[]{1,88,3,-4,-5,-6};
		for(int i=0;i<6;i++)
		{
			if(x[i] >0)
			{
				a=a+1;
			}
			
		}
		System.out.println("Positive Numbers : "+a);
		
		for(int i=0;i<6;i++)
		{
			if(x[i] <0)
			{
				b=b+1;
			}
			
		}
		System.out.println("Negative Numbers :"+b);
	}
}

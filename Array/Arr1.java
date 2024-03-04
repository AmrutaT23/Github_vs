//Array addition
class Arr1
{
	public static void main(String args[])
	{
		int x[]=new int[]{1,2,3,4,5};
		int y[]=new int[]{1,2,3,4,5};
		int z[]=new int[5];
		for(int i=0;i<5;i++)
		{
			z[i]=x[i] + y[i];
		}
		for(int i=0;i<5;i++)
		{
			System.out.print(z[i]+" ");
		}
	
		
	}
}	
			
		
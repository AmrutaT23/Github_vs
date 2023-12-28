//Even Number

class Arr2
{
	public static void main(String args[])
	{
		int x[]=new int[]{1,2,3,4,5,6};
		for(int i=0;i<6;i++)
		{
			if(x[i] % 2==0)
			{
				System.out.println("Even Number"+i+" : "+x[i]);
			}
		}
	}
}

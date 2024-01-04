/*Write sum of 10 natural number*/
class P1_sum
{
	int c;
	int N;
	void cal(int n)
	{
		this.N=n;
		for(int i=0;i<=n;i++)
		{
			c = c+i;
			
		}
	}
	void result()
	{
		System.out.println("The sum of first "+this.N+" natural number is:"+c);
	}

public static void main(String args[])
{
		P1_sum s = new P1_sum();
		
		s.cal(11);
		s.result();
}
}
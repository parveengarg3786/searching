class CommandLine
{
	public static void main(String arg[])

		{
			int sum=0;
			for(int i=0;i<arg.length;i++)
				{	
				 int d=Integer.parseInt(arg[i]);
				sum=sum+d;
				}
			System.out.println("sum of number is : " + sum);
		}
}
class Pattern
{
	public static void main(String arg[])
		{
			for(int j=1;j<=5;j++)
			{
				
				for (int i=5;i>=1;i--)
					{
					
					if(i==j)
						System.out.print("*");
					else
						System.out.print(i);
					}
				System.out.println();		
			}
		}
}
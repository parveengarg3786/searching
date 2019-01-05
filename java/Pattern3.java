class Pattern2
{
	public static void main(String arg[])
		{
			for(int rows=1;rows<5;rows++)
			{
				
				for (int column=1;column<5;column++)
					{
					
					if(rows==column)
						System.out.print("*");
					else
						System.out.println("0");
					}
						
			}
		}
}
import java.util.Scanner;
class Pattern1
{
	public static void main(String arg[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size");
			int size=sc.nextInt();
			for(int rows=1;rows<=size;rows++)
				{
					for(int column=1;column<=rows;column++)
						{
							System.out.print(column + " ");
						}
					System.out.println();
				}
		
		}	

}

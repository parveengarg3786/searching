import java.util.Scanner;
class Reverse
{
	public static void main(String arg[])
		{
			Scanner sc=new Scanner(System.in);
			int number=sc.nextInt();
			int reverseNumber=0;
			int x=0;
			for(int i=1;number!=0;i++)
			{
			x=number%10;
			reverseNumber=reverseNumber+x;
			number=number/10;
			if(number!=0)
			reverseNumber=reverseNumber*10;
			
			}
			System.out.println(reverseNumber);
		}
}

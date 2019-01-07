import java.util.Scanner;
class Power_Of_Number
{
	public static void main(String arg[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number ");
			int number=sc.nextInt();
			
			System.out.println("enter the power ");
			int power=sc.nextInt();
			int result=1;
			for(int i=1;i<=power;i++)
			{	
				if(power==1)
				System.out.println("Answer is  :" + number);
				else
				result=result*number;
				
			}
			System.out.println(result);

		}


}

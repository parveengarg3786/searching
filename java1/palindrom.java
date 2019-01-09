import java.util.Scanner;
class Palindrom
{
	public static void main(String arg[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int number=sc.nextInt();
			int store=0;
			int result=0;
			for(int i=1;number!=0;i++)
			{
				store=number%10;
				result=store+result;
				number=number/10;
				if(number!=0)
				result=result*10;
				
			}
			if(result==number)
				System.out.println("number is palindrom");
			else
				System.out.println("number is not palindrom as after reverse number form is : " + result);
		
		}

}

import java.util.Scanner;
class Prime_Number
{
	public static void main(String arg[])
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		boolean result=false;
		for(int i =2;i<number;i++)
			{
			if(number%i==0)
			 result=true;
			}
		if(result==true)
		System.out.println(number + " " + " is not a prime number");
		else		
		System.out.println(number + " :" +"number is prime number ");
		}	
		

}

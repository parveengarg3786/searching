import java.util.Scanner;
class Boolean 
{
	public static void main(String arg[])
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number you want to check if number is even or odd");
		int number=sc.nextInt();
		boolean check=check_num(number);
		if (check==true)
		System.out.println("number is even");
		else
		System.out.println("number is odd");
		}
		static boolean check_num(int number)
		{
			if (number%2==0)	
			return true;
			else
			return false;
			
		
		}




}
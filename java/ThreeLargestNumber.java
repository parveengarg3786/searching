import java.util.Scanner;
class LarestNumber
{
	public static void main(String arg[])
		{
			Scanner sc = new Scanner(System.in);
			int firstNumber=sc.nextInt();
			int secondNumber=sc.nextInt();
			int thirdNumber=sc.nextInt();
		
			if (firstNumber>secondNumber&&firstNumber>thirdNumber)
				System.out.println("first number is the largest");
			
			else if (secondNumber>thirdNumber)
				System.out.println("second number is the largest ");
			
			else 
				System.out.println("third number is the largest");
		}

}
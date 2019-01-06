import java.util.Scanner;
class Fibbonaci_Series
{
	public static void main(String arg[])
		{
			Scanner sc=new Scanner(System.in);
			int firstNumber=1;
			int secondNumber=1;
			System.out.println("enter the size");
			int size=sc.nextInt();
			System.out.print(+ firstNumber + "  " + secondNumber);
			for(int i=3;i<=size;i++)
				{
					int thirdNumber=firstNumber+secondNumber;
					System.out.print("  " + thirdNumber);
					firstNumber=secondNumber;
					secondNumber=thirdNumber;

				}
			System.out.println();		
		}

}

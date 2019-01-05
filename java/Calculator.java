import java.util.Scanner;
class Calculator
{
	public static void main(String arg[])
		{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("hi you are using calculator.\n1.Addition\n2.Subtraction\n3.Division\n4.multiplication");
			System.out.println("choose the option from above menu");
			int option=sc.nextInt();
			switch (option)
				{

					case 1:
						System.out.println("how  many number you want to add");
						int number=sc.nextInt();
						int temp=0;
						for(int i=1;i<=number;i++)
						{
							System.out.println("enter the number: ");
							 int a=sc.nextInt();
							temp=temp+a;
						}
							System.out.println("Answer" + temp);	
							break;		

					case 2:
						
						System.out.println("enter the first number");
						int firstNumber=sc.nextInt();
						System.out.println("enter the second number");
						int secondNumber=sc.nextInt();
						int result=firstNumber-secondNumber;
						System.out.println(" Answer"  +  result);
						break;
					case 3:
						
						System.out.println("enter the first number");
						int f=sc.nextInt();
						System.out.println("enter the second number");
						int g=sc.nextInt();
						int r=f/g;
						System.out.println(" Answer"  +  r);
						break;

					case 4:
						
						System.out.println("enter the first number");
						int x=sc.nextInt();
						System.out.println("enter the second number");
						int y=sc.nextInt();
						int z=x*y;
						System.out.println(" Answer"  +  z);
						break;


				}
		}

}
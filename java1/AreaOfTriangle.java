import java.util.Scanner;
class AreaOfTriangle
{
	public static void main(String arg[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("enter the height of triangle");
			double height=sc.nextInt();
	
			System.out.println("enter the value of base");	
			double base=sc.nextInt();

			double area=(height*base)/2;
			System.out.println("Area of triangle :" + area);
		}


}
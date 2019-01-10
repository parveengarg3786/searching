import java.util.Scanner;
class AreaOfCircle
{
	public static void main(String arg[])
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the value of radius");

			double radius=sc.nextInt();

			double area=3.14*radius*radius;
			
			System.out.print("Area of circle : " + area);
		}


}
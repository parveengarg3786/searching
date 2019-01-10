import java.util.Scanner;
class Searching
{
	public static void main(String arg[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number of element you want to add");
			int size=sc.nextInt();
			int a[]=new int[size];
			boolean result=false;
			int position=0;
			System.out.println("enter the elements");
			for(int i=0;i<size;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("enter the number you want to search");
			int number=sc.nextInt();
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==number)
				{
				position=j;
				result=true;
				break;
				}
				
			}
			if(result==true)
			System.out.println("number is found \naddress is :" + position);
			else
			System.out.println("number is not present in the array");
		}
}

import java.util.Scanner;
class Bubble_Sorting
{
	public static void main(String arg[])
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the number of element you want to add");
			int size=sc.nextInt();
			
			int a[]=new int[size];
			System.out.println("element before sorting");
			for(int i=0;i<size;i++)
			{
				a[i]=sc.nextInt();
			}
			int b[]=sorting(a);
			System.out.println("element after sorting");
			for(int j=0;j<b.length;j++)
			{
				System.out.println(b[j]);
			}
		}
	static int[] sorting(int a[])
		{
			int swap=0;
			for(int y=0;y<a.length;y++)
			{
				for(int x=1;x<a.length-y;x++)
					{
						if(a[x-1]>a[x])
							{
							swap=a[x];
							a[x]=a[x-1];
							a[x-1]=swap;
							}
					}
			}
			return a;
		}		
}

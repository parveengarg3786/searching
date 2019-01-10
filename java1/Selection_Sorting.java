import java.util.Scanner;
class Selection_Sorting
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
				for(int x=1+y;x<a.length;x++)
					{
						if(a[0+y]>a[x])
							{
							swap=a[x];
							a[x]=a[0+y];
							a[0+y]=swap;
							}
					}
			}
			return a;
		}		
}

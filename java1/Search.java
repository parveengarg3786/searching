import java.util.Scanner;
class Search
{
	public static void main(String arg[])
		{
			Scanner sc = new Scanner(System.in);
			int a[] = new int[10];
			for(int i=0;i<10;i++)
			{
				a[i]=sc.nextInt();
			}
		
			 int b[]=sort_array(a);
			System.out.print("after sorting of array");
			for(int e=0;e<10;e++)
			{
				System.out.println(b[e]);
			}
			
		}


	static int[] sort_array(int a[])	
		{
			for(int x=0;x<10;x++)
			{
			int smallest=0+x;
			for(int z=1+x;z<10;z++)
				{
					if(a[smallest]>a[z])
					{
						int temp=a[z];
						a[z]=a[smallest];
						a[smallest]=temp;
					}
					
					
					
					
				}
			}
			return(a);
		}

}
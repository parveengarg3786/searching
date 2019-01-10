import java.util.*;
class Array_List_iteration
{
	public static void main(String arg[])
		{
			ArrayList<String> ls=new ArrayList<String>();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number of element you want to add in arraylist");
			int size=sc.nextInt();
			sc.nextLine();
			for(int i=0;i<size;i++)
				{
					
					String value=sc.nextLine();
					ls.add(value);
				}
			Iterator it=ls.iterator();
			while(it.hasNext())
			{
			System.out.println(it.next());
			}
		
		}
}

package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuplicateElementOfArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the size");
		int size = Integer.parseInt(br.readLine());
		int array[] = new int[size];
		int second[] = new int[size];
		for(int i=0;i<size;i++)
		{
			array[i] = Integer.parseInt(br.readLine());
		}
		int count = 0;
		for(int i=0;i<size-1;i++)
		{
			for(int j=1+i;j<size;j++)
			{
				if(array[i]==array[j])
				{
					second[count]=array[i];
					count++;
					break;
				}
			}
		}
		
		for(int i=0;i<second.length;i++)
		{	if(second[i]!=0)
			{
			System.out.println(second[i]);
			}
		}
	}
}

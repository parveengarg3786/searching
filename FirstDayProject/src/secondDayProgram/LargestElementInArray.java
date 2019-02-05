package secondDayProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestElementInArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the size of array");
		int size = Integer.parseInt(br.readLine());
		int array[] = new int[size];
		
		for(int i=0;i<size;i++)
		{
			array[i] = Integer.parseInt(br.readLine());
		}
		
		int largestNumber = 0;
		for(int i=0;i<size;i++)
		{
			if(largestNumber<array[i])
			{
				largestNumber = array[i];
			}
		}
		
		System.out.println(largestNumber);
	}
}

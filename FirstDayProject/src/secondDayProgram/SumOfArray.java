package secondDayProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the size of array");
		int size = Integer.parseInt(br.readLine());
		int array[] = new int[size];
		
		for(int i=0;i<size;i++)
		{
			array[i] = Integer.parseInt(br.readLine());
		}
		
		int sum = 0;
		
		for(int i=0;i<size;i++)
		{
			sum=sum+array[i];
		}
		
		System.out.println(sum);
	}
}

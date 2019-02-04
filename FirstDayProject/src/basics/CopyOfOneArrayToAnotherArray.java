package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyOfOneArrayToAnotherArray {
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
		for(int i=0;i<size;i++)
		{
			second[i] = array[i];
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(second[i]); 
		}
		
	}
}

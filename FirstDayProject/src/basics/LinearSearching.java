package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearching {
	public static void main(String arg[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number of element you want to add");
		int size = Integer.parseInt(br.readLine());
		int array[] = new int[size];
		
		 for(int i=0;i<size;i++)
		 {
			 array[i] = Integer.parseInt(br.readLine());
		 }
		 
		 System.out.println("enter  the number you want to search");
		 int number = Integer.parseInt(br.readLine());
		 int result = 0;
		 for(int a=0;a<size;a++)
		 {
			 if(array[a] == number)
			 {
				 result = 1;
				 break;
			 }
		 }
		 
		 if(result == 1)
		 {
			 System.out.println("number found");
		 }
		 else
		 {
			 System.out.println("number not found");
			 
		 }
	}
}

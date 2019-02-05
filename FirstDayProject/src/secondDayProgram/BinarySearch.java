package secondDayProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {
		public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the number of element you want to add");
			int size = Integer.parseInt(br.readLine());
			int array[] = new int[size];
			
			 for(int i=0;i<size;i++)
			 {
				 array[i] = Integer.parseInt(br.readLine());
			 }
			 System.out.println("enter the number you want to search");
			 int number = Integer.parseInt(br.readLine());
			 
			 int first = 0;
			 int last = size;
			 int mid = (first+last)/2;
			 
			 while(first<=last)
			 {
				 if(number>array[mid])
				 {
					 first = mid+1;
				 }
				 else if(number == array[mid])
				 {
					 System.out.println("number found");
					 break;
				 }
				 else
				 {
					 last = mid-1;
				 }
				 mid = (first+last)/2;
			 }
			 if(array[mid]!=number)
			 {
				 System.out.println("number not found");
			 }
		}

}

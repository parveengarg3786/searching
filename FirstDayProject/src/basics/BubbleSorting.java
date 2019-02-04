package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSorting {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the number of element you want to add");
		int size = Integer.parseInt(br.readLine());
		int array[] = new int[size];
		
		 for(int i=0;i<size;i++)
		 {
			 array[i] = Integer.parseInt(br.readLine());
		 }
		 
		 int swap = 0;
		 
		 for(int j=0;j<size;j++)
		 {
			 for(int k=1;k<size-j;k++)
			 {
				 if(array[k-1]>array[k])
				 {
					 swap = array[k-1];
					 array[k-1] = array[k];
					 array[k] = swap;
				 }
			 }
		 }
		 for(int i=0;i<size;i++)
		 {
			System.out.println(array[i]);
		 }
		 
		 
	}
}




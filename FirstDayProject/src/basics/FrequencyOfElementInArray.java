package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FrequencyOfElementInArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the number of element you want to add");
		int size = Integer.parseInt(br.readLine());
		int array[] = new int[size];
		int second[] = new int[size];
		
		 for(int i=0;i<size;i++)
		 {
			 array[i] = Integer.parseInt(br.readLine());
		 }
		 int count = 0;
		 for(int a=0;a<size;a++)
		 {
			 count = 0;
			 for(int b=0;b<size;b++)
			 {
				 if(array[a] == array[b])
				 {
					 count++;
				 }
			 }
			 second[a] = count;
		 }
		 
		 for(int c=0;c<size;c++)
		 {
			 System.out.println(array[c] + "   " + second[c]);
		 }
	}
}
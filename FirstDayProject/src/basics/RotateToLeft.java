package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateToLeft {
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
	 
	 System.out.println("how much you want to rotate");
	 int rotate = Integer.parseInt(br.readLine());
	 int count = 0;
	 for(int i=0;i<size;i++)
	 {
		 if(i<size-rotate)
		 {
		 second[i]=array[i+rotate];
		 }
		 else
		 {
			 second[i]=array[count];
			 count++;
		 }
	 }
	 
	 for(int d=0;d<size;d++)
	 {
		 System.out.println(second[d]);
	 }
}
}

import java.util.Scanner;
public class Check_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		int number=sc.nextInt();
		if(number>=0)
			System.out.println("number is positive");
		else
			System.out.println("number is negative");
				

	}

}


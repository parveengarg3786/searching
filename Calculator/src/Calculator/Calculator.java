package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//making class which perform various operation

class CalculatorOperations
{

	int addition(int firstNumber,int secondNumber)
	{
		int add = firstNumber+secondNumber;
		return add;
	}
	int multiply(int firstNumber,int secondNumber)
	{
		int mul = firstNumber*secondNumber;
		return mul;
	}
	int subtraction(int firstNumber,int secondNumber)
	{

		int sub = firstNumber-secondNumber;
		return sub;
	}
	int division(int firstNumber,int secondNumber)
	{

		int div = firstNumber/secondNumber;
		return div;
	}

}

// main class

public class Calculator {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		CalculatorOperations op = new CalculatorOperations();
		
		System.out.println("hello how can i help you");
		
        int result=0, secondNumber , firstNumber;

        while(true)
        {
            String line = br.readLine();//read the line like 2+3
        	if(line.equals("exit"))
        	{
              break;  
            }
        
            String[] part = line.split("[+,*,/,-]");//divide above string into two parts

            if(part[0].equals(""))
            {
                firstNumber = result;
                secondNumber = Integer.parseInt(part[1]);
             }
             else
             {
                firstNumber = Integer.parseInt(part[0]);
                secondNumber = Integer.parseInt(part[1]);
             }
             if(line.contains("+"))
             {
                result = op.addition(firstNumber,secondNumber);
				System.out.println(result);
             }
             else  if(line.contains("-"))
             {
                result = op.subtraction(firstNumber,secondNumber);
				System.out.println(result);
   
             }
             else  if(line.contains("*"))
             {
            	result = op.multiply(firstNumber,secondNumber);
				System.out.println(result);
   
             }
             else  if(line.contains("/"))
             {
                result = op.division(firstNumber,secondNumber);
				System.out.println(result);
   
             }
          }
	}
}



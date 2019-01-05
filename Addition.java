import java.util.Scanner;
class MenuDriven{
          public static void main(String arg[]){
    
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the choice\n1.Division\n2.addition\n3.subtraction\n4.multiplication");

          int choice=sc.nextInt();

          switch(choice)
{
      case 1:
          System.out.println("enter the first number: ");
          int firstNumber=sc.nextInt();

          System.out.println("enter the second number: ");
          int secondNumber=sc.nextInt();
          int thirdNumber=firstNumber/secondNumber;
                      

          System.out.println(firstNumber + "/" + secondNumber + "=" + thirdNumber);
          break;

     case 2:
          System.out.println("enter the first number: ");
          firstNumber=sc.nextInt();
          System.out.println("enter the second number: ");
          secondNumber=sc.nextInt();
          thirdNumber=firstNumber+secondNumber;
                      

         System.out.println(firstNumber + "+" + secondNumber + "=" + thirdNumber);
         break;

     case 3:
          System.out.println("enter the first number: ");   
         firstNumber=sc.nextInt();
         System.out.println("enter the second number: ");
         secondNumber=sc.nextInt();
         thirdNumber=firstNumber-secondNumber;
                      

         System.out.println(firstNumber + "-" + secondNumber + "=" + thirdNumber);
         break;

   case 4:
       System.out.println("enter the first number: ");
        firstNumber=sc.nextInt();
       System.out.println("enter the second number: ");
        secondNumber=sc.nextInt();
        thirdNumber=firstNumber*secondNumber;
                      

       System.out.println(firstNumber + "*" + secondNumber + "=" + thirdNumber);
       break;

   default:
        System.out.println("enter the wright choice");




}
         







}







}
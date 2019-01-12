import java.util.*;
import java.io.*;//header file

class First
{
public static void main(String args[])
{
	float num1,num2;
	char choice;
Console console = System.console();
	do 
	{

	Scanner as=new Scanner(System.in);
    System.out.println("enter the first number:");
    num1=as.nextFloat();
	
System.out.format("Round off number upto 3 decimal is %.3f\n",num1);//round off till 3 decimal places
    System.out.println("enter the second number:");
    num2=as.nextFloat();
System.out.format("Round off number upto 3 decimal is %.3f\n",num2);//round off till 3 decimal places	


if(num1==num2)//conditional
{

	System.out.println("they are equal");

}
else
	{
		System.out .println("they are not equal");
		
	}
 

 choice = console.readLine("Do You Want To Continue (Y/N)?: ").charAt(0);//read the line to user and take the input
         
        }while((choice!='n')&&(choice!='N'));
    }
}
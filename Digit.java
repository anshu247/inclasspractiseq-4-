import java.util.*;
import java.io.*;
public class Digit
{
    public static void main(String[] args)
    {
        Scanner as = new Scanner(System.in);
		    Console console = System.console();
        int num,num1,num2,num3,num4,num5;
		char choice;
        
do
{
	System.out.print("Enter a number with 5 digits: ");
num=as.nextInt();
if(num<99999 && num>9999)
{

 
   num1 = num / 10000;
        num2 = (num % 10000) / 1000;
        num3 = ((num % 10000) % 1000) / 100;
        num4 = (((num % 10000) % 1000) % 100) / 10;
        num5 = (((num % 10000) % 1000) % 100) % 10;
		System.out.println(num1 + "   " +num2 +"   " +num3+"   " +num4+"   " +num5 );
		
}
else
{
	System.out.print("plz enter the 5 digit number");   
	
}	
		choice = console.readLine("Do You Want To Continue (Y/N)?: ").charAt(0);
    } while((choice!='n') && (choice!='N'));
}}
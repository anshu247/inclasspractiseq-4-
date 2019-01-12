import java.util.*;
import java.io.*;


class Year{
public static void main(String args[])
{
	
float years,min,months,days,hrs;
char choice;
Console console = System.console();
Scanner as=new Scanner (System.in);
do
{
System.out.println("enter the  minute:");
min=as.nextFloat();
hrs= min/60;
days=hrs/24;
months=days/30;
years=months/12;
System.out.println("the min you have entered " +min);
System.out.println("the min is equal to " +hrs + " hours");
System.out.println("this is equal to " +days +" days");
System.out.println("this is equal to "+months +" months");
System.out.println("this is equal to "+years +" years");
choice = console.readLine("Do You Want To Continue (Y/N)?: ").charAt(0);
        //choice=input.next().charAt(0);;
        }while((choice!='n')&&(choice!='N'));
}


	


}





import java.util.*;
import java.io.*;

class Pascal{
	
public static void main(String args[])
{   
int spaces;  
char choice;
Console console = System.console();                                      

int number=1;

do
{
	System.out.print("enter the number the rows:");//
Scanner Sc=new Scanner(System.in);
int no=Sc.nextInt();
spaces=no;
	
for(int i=0;i<no;i++)
{
//nested loop for spaces
	for(int s=0;s<=spaces;s++)
	{
System.out.print(" ");
	}
number=1;
for(int j=0;j<=i;j++)
{
System.out.print(number+" ");
number =number*(i-j)/(j+1);
}
spaces--;
System.out.println();

}
choice = console.readLine("Do You Want To Continue (Y/N)?: ").charAt(0);
}while((choice!='n')&&(choice!='N'));
}
}
import static java.lang.Math.pow;
import java.util.*;
import java.ios.*;
class Series{
public static void main(String args[])
{
int terms,count,total=0;
double x ;
char choice;
Console console = System.console();
	do 
	{    
Scanner as=new Scanner(System.in);

System.out.println("enter the value of X");
x=as.nextInt();

System.out.println("enter the value of terms");
terms=as.nextInt();

for(count=1;count<=terms;count++)
{  
    total+=Math.pow(x,count)/count;
}
System.out.println("the SUM is"+total);
        choice = console.readLine("Do You Want To Continue (Y/N)?: ").charAt(0);
         
        }while((choice!='n')&&(choice!='N'));

}
}

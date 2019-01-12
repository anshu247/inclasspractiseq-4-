import static java.lang.Math.pow;
import java.util.*;
class Series{
public static void main(String args[])
{
int terms,count,total=0;
double x ;
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
}
}
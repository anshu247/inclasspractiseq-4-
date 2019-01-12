
import java.util.*;
class Quar{
 public static void main(String []args)
 {  System.out.println("enter a,b,c");
 	Scanner input =new Scanner(System.in);
 	int a =input.nextInt();
int b=input.nextInt();
int c =input.nextInt();
 	//Scanner input =new Scanner(System.in);
 	//int b =input.nextInt();

 	//Scanner input =new Scanner(System.in);
 	//int c =input.nextInt();
 	/*Partial Sol of the Quadratic equation stored in variable*/

double result = b*b -4.0*a*c;
/*tf value of result is greater then 0 then 2 sol ,if result=0 is */
if (result>0.0){

double r1=(-b +Math.pow(result,0.5))/(2.0*a);
double r2=(b +Math.pow(result,0.5))/(2.0*a);
System.out.println("the root are "+ r1+"and "+r2);




}

else if(result==0.0){

	double r1= -b/(2.0*a);

}


else 


{

	System.out.println("roots not possible");

}

 } 






}
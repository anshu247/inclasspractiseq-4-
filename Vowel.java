import java.util.*;
public class Vowel{

    public static void main(String[] args) {
Console console = System.console();
	do 
	{
    	System.out.println("enter a alphabhet");
    	Scanner as=new Scanner(System.in);
          char ch=as.next.charAt(0);
     boolean uppercase =input.charAt(0)>=65&& input.charAt(0)<=90;
     boolean lowercase=input.charAt(0)>=97&& input.charAt(0)<=122;
        if(ch!=charAt(0))
        	{System.out.println("error ,enter only one alphabhet");
    }
 else if (ch!(uppercase||lowercase))
{System.out.println("error ,enter only one alphabhet");}

        else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

     choice = console.readLine("Do You Want To Continue (Y/N)?: ").charAt(0);
       
        }while((choice!='n')&&(choice!='N'));
}}
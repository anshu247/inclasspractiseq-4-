import java.util.*;
import java.io.*;

 class Program7 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Console console = System.console();
char choice;
  int counter = 1;
        int counter2 = 1;
        char c = 'A';
		do
		{
		System.out.println("Input the number: ");
        int n = sc.nextInt();
      
		
        for (int i = 1; i < (n * 2); i++) 
        {
            for (int spc = n - counter2; spc > 0; spc--)   
            //print space
            {
                System.out.print(" ");
            }
            if (i < n) 
            {
                counter2++;
            } 
            else 
            {
                counter2--;
            }
            for (int j = 0; j < counter; j++) 
            {
                System.out.print(c);//print Character
                if (j < counter / 2) 
                {
                    c++;
                } else 
                {
                    c--;
                }
            }
            if (i < n)
            {
                counter = counter + 2;
            } 
            else
            {
                counter = counter - 2;
            }
            c = 'A';

            System.out.println();
        }
		
		choice = console.readLine("Do You Want To Continue (Y/N)?: ").charAt(0);
	}while((choice!='n')&&(choice!='N'));
    }
}
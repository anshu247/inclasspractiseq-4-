import java.util.*;

class question3operator
{
    public static void main(String[] args) 
	{
    	
		// Relational Operator
		
    	int number1 = 5, number2 = 6 , number3 = 9;

    	if (number1 > number2)
    	{
    		System.out.println("number1 is greater than number2.");
    	}
    	else
    	{
    		System.out.println("number2 is greater than number1.");
    	}
		
	// Logical Operators
	
    	boolean result;
    	
    	// At least one expression needs to be true for result to be true
    	result = (number1 > number2) || (number3 > number1);
    	// result will be true because (number1 > number2) is true
    	System.out.println(result);
    			
    	// All expression must be true from result to be true	
    	result = (number1 > number2) && (number3 > number1);
    	// result will be false because	(number3 > number1) is false
    	System.out.println(result);
		
			// boolean Operators
		 boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;
        
        System.out.println("        a = " + a);
        System.out.println("        b = " + b);
        System.out.println("      a|b = " + c);
        System.out.println("      a&b = " + d);
        System.out.println("      a^b = " + e);
        System.out.println("!a&b|a&!b = " + f);
        System.out.println("       !a = " + g);   
		
    }
}
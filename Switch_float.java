package pack2;
import java.util.*;
public class Switch_float 
{
	public static void main(String[] args) 
	{
	Scanner obj = new Scanner(System.in);
	System.out.println("enter two numbers:");
	float a = obj.nextFloat();
	float b = obj.nextFloat();
	System.out.println("a.addition");
	System.out.println("b.subtraction");
	System.out.println("c.muitiplication");
	System.out.println("d.division");
	System.out.println("enter choice[a..d]:");
	String ch = obj.next(); //a
	switch(ch)
	{
	case "a":
		 System.out.println("addition ="+(a+b));
	     break;
	case "b":
		System.out.println("subtraction ="+(a-b));
		break;
	case "c":
		System.out.println("multiplication ="+(a*b));
		break;
	case "d":
		System.out.println("division ="+(a/b));
		break;
    default:
    	System.out.println("invalid choice");
	}
	}
	}



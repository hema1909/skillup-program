package pack2;
import java.util.*;
public class Switch
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter two numbers:");
		int a = obj.nextInt();
		int b = obj.nextInt();
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("enter choice[1..4]:");
		int ch = obj.nextInt(); //1
		switch(ch)
		{
		case 1:
			System.out.println("addition ="+(a+b));
		    break;
		case 2:    
		    System.out.println("subtraction ="+(a-b));
		    break;
		case 3:
			System.out.println("muitiplication ="+(a*b));
			break;
		case 4:
			System.out.println("division ="+(a/b));
			break;
	    default:
			System.out.println("invalid choice");
		}
	}

}

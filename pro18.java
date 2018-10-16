import java.util.Scanner;
class Maths
{
	public static long divide(long x,long y)
	{	return (x/y);
	}
	public static long subtract(long x,long y)
	{
		return x-y;
	}
	public static long add(long x,long y)
	{
		return x+y;
	}
	public static long multiplication(long x,long y)
	{
		return x*y;
	}
	public static long modolus(long x,long y)
	{
		return x%y;
	}
}

class Pro18
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
	    	char op;
		do
		{
			System.out.println("Enter the 1st operand value:- ");
			long x=sc.nextLong();
			System.out.println("\nEnter the 2nd operand :-");
			long y=sc.nextLong(); 
			System.out.println("Enter the operator [+,-,/,*,%]:- ");
			op=sc.next().charAt(0);
			switch(op)
			{
				case '+':System.out.println(x+" + "+ y+" = "+Maths.add(x,y));
						 break;
				case '-':System.out.println(x+" - "+ y+" = "+Maths.subtract(x,y));
						break;
				case '*':System.out.println(x+" * "+ y+" = "+Maths.multiplication(x,y));
						 break;
				case '/':System.out.println(x+" / "+ y+" = "+Maths.divide(x,y));
						break;
				case '%':System.out.println(x+" % "+ y+" = "+Maths.modolus(x,y));
						break;
				default:System.out.println("Invalid choice Kindly enter correct operator");
						break;
			}
			System.out.print("Do you want to continue [Y/N]:-");
			op=sc.next().toUpperCase().charAt(0);
		}while(op=='Y');
		
	}
}
		
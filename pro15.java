import java.util.Scanner;
class Pro15
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number");
		long n=sc.nextLong();
		long c,a=-1,b=1;
		boolean Flag=false;
		while(true)
		{
			c=a+b;
			if(c>n)
				break;
			if(c==n)
				Flag=true;
			System.out.print(c+"\t");
			a=b;
			b=c;
		}
		System.out.println();
		System.out.print(Flag?n+" is the part of fibonacci series":n+" is not part of fibonacci series");
	}
}
	
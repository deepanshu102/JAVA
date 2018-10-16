import java.util.Scanner;
class Pro9
{
        public static void main(String [] args)
        {
                Scanner sc=new Scanner(System.in);
                int d;
                System.out.println("Enter your digit");
                d=sc.nextInt();
                int temp=d;
		int k=0,re;
                while(d>0)
                {
                        re=d%10;
                        d/=10;
                        k=k*10+re;
                }
		if(k==temp)
		{System.out.println(k+" is Palindrome");}
		else
		{
			System.out.println(temp+" is not palindrome");
		}
        }
}


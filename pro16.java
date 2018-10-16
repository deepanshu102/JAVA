import java.util.Scanner;
class Pro16
{
        public static void main(String [] args)
        {
                Scanner sc=new Scanner(System.in);
                long i=sc.nextLong();
		long  fac=1;
                for(long j=1;j<=i;j++)
                {
                        fac=fac*j;
                }
		System.out.println(fac+" is the factorial of "+i);
        }
}


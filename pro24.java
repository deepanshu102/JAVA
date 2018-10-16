import java.util.Scanner;
enum options
{
	EVEN,ODD;
}
class Pro24
{
        public static void main(String [] args)
        {
                int n;
		char c;	
		System.out.print("Enter the Size of the List:- ");
                n=(new Scanner(System.in)).nextInt();
                int [] a=new int[n];
                int i;
	                for(i=0;i<n;i++)
                {
                        System.out.print("\nEnter the Value of "+(i+1));
                        a[i]=(new Scanner(System.in)).nextInt();
                }
		System.out.println("Which one you want to print \n1.)Even\n 2.)ODD\n Enter your choice:- ");
		c=(new Scanner(System.in)).next().charAt(0);
	
                for(i=0;i<n;i++)
                {
			if(c=='1' && a[i]%2==0)
			{
				System.out.println(a[i]+" is Even Number");
			}
			else if(c=='2' && a[i]%2==1)
				System.out.println(a[i]+" is odd number");
                }
        }
}

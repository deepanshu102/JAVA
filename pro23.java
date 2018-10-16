import java.util.Scanner;
class Pro23
{
        public static void main(String [] args)
        {
                Float sum=0f;
		int n;
                System.out.print("Enter the Size of the Number:- ");
                n=(new Scanner(System.in)).nextInt();
                int [] a=new int[n];
                int max,min,i;
		for(i=0;i<n;i++)
		{
			System.out.print("\nEnter the value of "+(i+1));
			a[i]=(new Scanner(System.in)).nextInt();
		}

		min=max=a[0];
                for(i=0;i<n;i++)
                {
                        if(a[i]>max)
                                max=a[i];
                        if(a[i]<min)
                                min=a[i];
                        sum+=a[i];
                }
                System.out.print("\nMax value is :- "+max);
                System.out.print("\nMin value is:- "+min);
                System.out.print("\nAverage Value:- "+(sum/n));
        }
}


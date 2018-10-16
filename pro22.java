import java.util.Scanner;
class Arrange
{
        int [] a;
        Arrange(int n)
        {
                a=new int[n];
        }
        void Accept()
        {
                for(int i=0;i<a.length;i++)
                {
                        System.out.println("Enter the Number "+(i+1));
                        a[i]=(new Scanner(System.in)).nextInt();
                }
        }
        int Ascending()
        {
                int [] b=new int[a.length];
		int i,j;
		for(i=0;i<a.length;i++)
			b[i]=a[i];


		for(i=0;i<b.length;i++)
		{
			for(j=i+1;j<b.length;j++)
			{
				if(b[i]<b[j])
				{
					b[i]+=b[j];
					b[j]=b[i]-b[j];
					b[i]=b[i]-b[j];
				}	
			}
		}
		for(i=0;i<b.length;i++)
		{System.out.print(b[i]+"\t");
		}
		return 1;

        }
        int Descending()
        {
                int [] b=new int[a.length];
		int i,j;

		for(i=0;i<a.length;i++)
			b[i]=a[i];


		for(i=0;i<b.length;i++)
		{
			for(j=i+1;j<b.length;j++)
			{
				if(b[i]>b[j])
				{
					b[i]+=b[j];
					b[j]=b[i]-b[j];
					b[i]=b[i]-b[j];
				}	
			}
		}
		for(i=0;i<b.length;i++)
		{System.out.print(b[i]+"\t");
		}
		return 1;
        }
}
class Pro22
{
        public static void main(String [] args) 
        {	System.out.print("Enter the Size of the Number:- ");
                int size=(new Scanner(System.in)).nextInt();
                Arrange obj =new Arrange(size);
		obj.Accept();
		System.out.print("\n1.)Print Ascending Order\n2.)Print Descending order\nEnter your choice:-");
		char c=(new Scanner(System.in)).next().toUpperCase().charAt(0);
		System.out.println(c=='1'?obj.Ascending()==1?"Thanks for using the program":"Sorry some problem occured":c=='2'?obj.Descending()==1?"Thanks for using the program":"Sorry some problem occured":"Invalid choice");
        }
}


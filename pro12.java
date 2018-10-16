import java.util.Scanner;
class Pro12
{
        public static void main(String [] args)
        {
                Integer [] arr= new Integer[20];
		Integer i=-1;
		int c;                
                Scanner sc=new Scanner(System.in);
                do
                {
                        System.out.print("Enter the number: ");
                        arr[++i]=sc.nextInt();
                        System.out.print("Do you want to enter more data");
                        System.out.print("\t for exit press 0");
                        c=sc.nextInt();
                }while(c!=0);
                for(Integer k :arr)
			if(k!=null)
                        System.out.println(k);
        }
}

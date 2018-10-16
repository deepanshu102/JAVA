import java.util.Scanner;
// Scanner is the class to help the user input
class Pro8
{
        public static void main(String [] args)
        {
                Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value");
                int i=sc.nextInt();
            
                System.out.println("\n1.)Convert Celsius to Fahrenheit\n2.)Check enter number is even or odd");
                System.out.println("Enter your choice");
                int k=sc.nextInt();
                switch(k)
                {
                        case 1:System.out.print(i+"C= "+ cel_Fah(i)+" F"
);
                break;
                        case 2:System.out.println(i+" is "+c_ev_od(i));
                                break;
                        default:        System.out.println("Invalid input");break;
                }
        }
        static double cel_Fah(int i)
        {    return (double)i*9/5+32;
        }
        static String c_ev_od(int i)
        {
                if(i%2==0)
                        return "Even";
                else
                        return "odd";
        }
}


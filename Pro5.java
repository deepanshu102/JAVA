public class pro5
{	static int i=0;
        public static void main(String []args)
        {	pro5.i++;
		int [] arg={123,456,768,6543};	
                System.out.println("I AM STRING ARRAY MAIN()");
		if(i++<=4)
		pro5.main(arg);
		
        }
        public static void main(int [] args)
        {	String arb="hello";
                System.out.println("I am Integer array main()");
		pro5.main(arb);	
        }
        public static void main(String arg)
        {
		String [] ar={"Hello", "how", "are","you"};
                System.out.println("I am string main ()"+pro5.i);
		pro5.main(ar);
        }
}

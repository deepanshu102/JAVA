class Pro27
{
	public static void main(String []args)
	{
		int i=10;
		Integer k=new Integer(i);
		int p=k;
		System.out.println("Wrapper :- "+k);
		int j=new Integer(k);
		System.out.println("Primitive:- "+j);
		 p=k.valueOf(20);
		 System.out.println("Primitive using Valueof(20):- "+p);
			}
}


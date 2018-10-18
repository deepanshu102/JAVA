class Pro31
{
	public static void main(String [] args)
	{
		StringBuffer str=new StringBuffer("Hello Jims Students");
		char [] c=new char[10];
		System.out.println("Capacity:- "+str.capacity());
		str.setLength(100);
		System.out.println("Capitity:-"+str.capacity());
		System.out.println((int)str.charAt(11));
		str.setCharAt(11,'s');
		System.out.println(str);
		str.getChars(10,20,c,0);
		System.out.println(c);
		str.insert(20," how are you");
		System.out.println(str);
		str.insert(0,"MCA 3rd ");
		System.out.println(str);
		str.replace(14,19,"jims ");
		System.out.println(str);
		System.out.println((str.substring(19,29)));
		str.delete(8,13);
		System.out.println(str);
	}
}

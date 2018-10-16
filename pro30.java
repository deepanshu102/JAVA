class MyString
{
	private String str1,str2;
	public MyString()
	{
		str1="Welcome to Java tutorial";
		str2="Todays topic is String Handling in Java";
	}
	public void operations()
	{
		System.out.println("Concate to String:-"+str1.concat(str2));
		System.out.println("Lower case of str1:- "+str1.toLowerCase());
		System.out.println("Uppercase of Str2:-"+str2.toUpperCase());
		System.out.println("Check equal or not:-"+str1.equals(str2));
		System.out.println("Find the location of 'j' in str1:-"+str1.indexOf('j'));
		System.out.println("Finding the location of 'j' in str2:-"+str2.indexOf('j'));
		str1.replace('i','l');
		str2.replace('i','l');
		System.out.println("After replace i to l in both:- "+str1+"\n"+str2);
		System.out.println("Java displaying:- "+str1.substring(str1.indexOf('J'),str1.lastIndexOf('a')));
		System.out.println("7th char of str1:-"+str1.charAt(8));
		String [] ar=str1.split(" ");//string.split("delimeter",<optional>int limit)
		System.out.println("using split()"+ar[0]);

	}
	public static void main(String [] args)
	{
		MyString obj1=new MyString();
		obj1.operations();
	}
}

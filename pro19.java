import java.util.Scanner;
enum Gender
{
	Male,Female,Transgender;
}
class Person
{
        private String name,address;
	private long contact;
        private Gender gen;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Full Name:- ");
		name=sc.nextLine().toUpperCase();
		System.out.println("Enter Your gender [M/F/0]:-");
		char g=sc.next().toUpperCase().charAt(0);
		gen=g=='M'?Gender.Male:g=='F'?Gender.Female:Gender.Transgender;
		
		System.out.println("Enter Your Residential Address:-");
		address=sc.next();
		System.out.println("Enter your Contact Number:-");
		contact=sc.nextLong();
	}
	public void display()
	{
		System.out.println("Name:- "+name+"\tGender:- "+gen+"\nAddress :-"+address.toUpperCase()+"\t Contact No:-"+contact);
	}
		
}
class Pro19
{
	public static void main(String [] args)
	{
		
		Person p0=new Person();
		p0.accept();
		p0.display();
	}
}

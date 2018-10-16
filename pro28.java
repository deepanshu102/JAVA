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
	public void Accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Full Name:- ");
		name=sc.nextLine().toUpperCase();
		System.out.println("Enter Your gender [M/F/0]:-");
		char g=sc.next().toUpperCase().charAt(0);
		gen=g=='M'?Gender.Male:g=='F'?Gender.Female:Gender.Transgender;
		
		System.out.println("Enter Your Residential Address:-");
		address=(new Scanner(System.in)).nextLine();
		System.out.println("Enter your Contact Number:-");
		contact=sc.nextLong();
	}
	public void Display()
	{
		System.out.println("Name:- "+name+"\tGender:- "+gen+"\nAddress :-"+address.toUpperCase()+"\t Contact No:-"+contact);
	}
		
}
interface College
{
	public final String code="IP1007",Name="JIMS";
	public void education();
}
class Student extends Person implements College
{
	private String Rollno,course;
	public void Accept()
	{
		super.Accept();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Roll No:- ");
		Rollno=sc.nextLine();
		System.out.println("\nEnter Your course:- ");
		course=sc.nextLine();
	}
	public void Display()
	{
		super.Display();
		System.out.println("Enroll:- "+Rollno+" \t Course:-"+course);
		education();
	}
	public void education()
	{
		System.out.println("College:-"+Name+"\t Code:-"+code);
	}
}
class Employee extends Person
{
	private String Empid,Department;
	public void Accept()
	{
		super.Accept();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Employee ID:- ");
		Empid=sc.nextLine();
		System.out.println("\nEnter Your Department:- ");
		Department=sc.nextLine();
	}
	public void Display()
	{
		super.Display();
		System.out.println("Employee Id:- "+Empid+" \t Department:-"+Department);
	}
}
class Pro28
{
	public static void main(String [] args)
	{
		Student s1=new Student();
		Employee emp1=new Employee();
		s1.Accept();
		s1.Display();
		emp1.Accept();
		emp1.Display();
	}
}

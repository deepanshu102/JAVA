import java.util.Scanner;
class HumanBeings
{
	public HumanBeings()
	{
		height=5.5;
		weight=50;
		name=null;
	System.out.println("Hey I am HumanBeings default constructor");
	}
	public HumanBeings(int w,double h,String n)
	{
		name=new String(n);
		weight=w;
		height=h;
		System.out.println("Hey I am HumanBeings parameterize constructor");
	}
	/*public String toString()
	{
		return "Name: "+name+" Height:-"+height+" weight:- "+weight;
	}*/
	public void insertData()
	{
		System.out.println("Enter your name:-");
		name=(new Scanner(System.in)).next().toUpperCase();
		System.out.println("Enter your Height:- ");
		height=(new Scanner(System.in)).nextDouble();
		System.out.println("Enter your Weight:- ");
		weight=(new Scanner(System.in)).nextInt();
	}
	public void display(){System.out.println("Name:- "+name+"\nHeight:-"+height+"\nWeight"+weight);}

	protected int weight;
	protected double height;
	protected String name;
	
}
class Man extends HumanBeings
{
	private String occ,desig;
	private long salary;
	public Man()
	{
		occ=new String("Student");//DEEP COPY
		desig="Student";//Shallow Copy
		salary=0l;//l for long
		System.out.println("Default constructor of Man class");
	}

	public Man(String oc,String desi,long sal)
	{
		occ=new String(oc);//Deep Copy
		desig=desi;//Shallow copy
		salary=sal;
	}
	public void insertData()
	{
		super.insertData();
		System.out.println("Enter your Occupation");
		occ=(new Scanner(System.in)).next().toUpperCase();
		System.out.println("Enter your Designation:- ");
		desig=(new Scanner(System.in)).next().toUpperCase();
		System.out.println("Enter your Salary per annumm");
		salary=(new Scanner(System.in)).nextLong();

	}
	public void display()
	{
		super.display();
		System.out.println("Occupation:- "+occ+"\tdesignation: "+desig+"\nSalary:-"+salary);
	}
	public String toSting()
	{
		System.out.println("I am called form Children");
		return null;
	}

}
class Pro29Copy
{
	public static void main(String [] args)
	{
		HumanBeings obj1=new Man();
		obj1.insertData();
		obj1.display();
		System.out.println(obj1);
	}
}


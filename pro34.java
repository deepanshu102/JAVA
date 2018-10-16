import java.util.Scanner;
class InvalidMarksException extends RuntimeException
{
	public String toString()
	{
		return "Your entered marks is Invalid Kindlly check your marks and refill again:---";
	}
}
class Student
{
	public Student()
	{
		name=null;
		mark=new int[5];
	}
	public Student(Student s1)
	{
		name=s1.name+" 1";
		mark =new int[5];
		for(int i=0;i<5;i++)
			mark[i]=s1.mark[i];
	}
	public Student(String n,int m[])
	{
		name=new String(n);
		mark=m;
	}
	public void insertData()throws InvalidMarksException
	{
		System.out.println("Enter the Name of Student:-");
		name=(new Scanner(System.in)).nextLine().toUpperCase();
		System.out.println("Enter the Marks of 5 subject");
		for(int i=0;i<5;i++)
		{
			mark[i]=(new Scanner(System.in)).nextInt();
			if(mark[i]<0 || mark[i]>100)
			{
				throw new InvalidMarksException();
			}
		}
	}
	public void displayGrade()
	{
		System.out.println("Name:-"+name+"\n Grade:-"+calGrade());

	}
	private char calGrade()
	{
		int sum=0;
		for(int i=0;i<5;i++)
			sum+=mark[i];
		sum/=5;
		return sum<=100 && sum>=80?'A':sum>=79 && sum<=60?'B':sum<=59 && sum>=40?'C':sum<40?'F':'E';
	}
	private int mark[];
	private String name;
}
class Pro34
{
	public static void main(String []args)
	{
		Student s1=new Student();
		s1.insertData();
		s1.displayGrade();
		
	}
}

	



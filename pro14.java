import java.util.Scanner;
class Student
{
        public static int cal_grade(float mark)
        {
                float av=mark/5;
                System.out.println((av<=100 && av>=80)?"\nA":(av<80 && av>=60)?"\nB":(av>=40 && av<60)?"\nC":(av<40)?"FAIL":"Inavlid marks");
		return 1;
        }
        public static void mark_detail()
        {
                int i=0;
		float m=0f,mark;
                Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++)
                {
			System.out.print("Enter the mark of "+(i+1)+" subject:- ");
                        mark=sc.nextFloat();
			if(mark>100)
			{
				System.out.println("Kindly enter correct marks of "+(i+1)+" subject ");
				i--;
			}
			else
	                        m+=mark;
                }
                System.out.println(cal_grade(m)==1?"\n thanks for using my program":"\n Sorry for Some issues occur");
        }
}
class Pro14
{
        public static void main(String [] args)
        {
                
                Student.mark_detail();
        }
}


import java.util.Scanner;
class ABC
{
        private int i;
        public void show()
        {
                int i=10;
                System.out.println("value of Local variable i is :- "+i);
                System.out.println("Value of Instance variabel i is : "+this.i);
        }
        public void accept()
        {
                i=20;
                show();
        }
}
class Pro21
{
        public static void main(String [] args)
        {
                ABC obj=new ABC();
                obj.accept();
        }
}

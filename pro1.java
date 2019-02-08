import java.util.Scanner;
class LinkList_Beg
{
	class Node
	{
			int ele;
			Node next;
		public Node()
			{
				ele=0;
				next=null;
			}
			public void add()
			{
				System.out.print("Enter the Value :- ");
				ele=(new Scanner(System.in)).nextInt();
				next=null;
			}
			public int get()	
			{
				return ele;
			}
			public Boolean isEmpty_next()
			{
				if(next==null)
					return true;
				return false;
			}
			public Node Next_Node()
			{
				return next;
			}
			
	}
	Node Head;
	public LinkList_Beg()
		{
			Head=null;
		}
		public void add()
		{
			Scanner sc=new Scanner(System.in);
			Node N=new Node();
			N.add();
			if(isEmpty())
			{
				
				Head=N;
			}
			else
			{
				N.next=Head;
				Head=N;	
			}
		}
		public void delete()
		{
			if(isEmpty())
			{
				System.out.println("No item Found");
			}
			else
			{
				Node temp=Head;
				Head=temp.Next_Node();
				System.out.printf("Processed Element is %d",temp.get()); 
				temp=null;	
			}
		}
		public void display()
		{
			if(isEmpty())
				System.out.println("Nothing in The List");
			else
			{
				Node n=Head;
				while(n!=null)
				{
					System.out.print(n.get()+"\t");
					n=n.Next_Node();
				}
			}	
		}
		public Boolean isEmpty()
		{
			return (Head==null)?true:false;
		}
}
class DS_Beg_LL_java
{
public static void main(String [] args)
{
	LinkList_Beg obk=new LinkList_Beg();
	int ch;
	do
	{
		System.out.println("\n1.)Adding Element in The Beginning\n2.)Deleting the Element at Beginning\n3.)Display the list\t 0.] Exit\nEnter you Choice:- ");
		ch=(new Scanner(System.in)).nextInt();
		switch(ch)
		{
			case 1:obk.add();break;
			case 2:obk.delete();break;
			case 3:obk.display();break;
			case 0:System.exit(0);break;
			default:System.out.println("Invalid Choice");
		}
	}while(ch!=0);
}
}
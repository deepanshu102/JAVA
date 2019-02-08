import java.util.Scanner;

class LinkList_End
{
	private class Node
	{
		int ele;
		Node next;
		public Node()
		{
			ele=0;
			next=null;
		}
		public Boolean isEmpty()
		{
			return (next==null);
		}
		public Node Node_Next()
		{
			return next;
		}
		public int get()
		{
			return ele;
		}
		public void add()
		{
			System.out.println("Enter the Value:- ");
			ele=(new Scanner(System.in)).nextInt();
			next=null;
		}
		public void set()
		{
			next=null;
		}
	}
	private Node Root;
	public LinkList_End()
	{
		Root=null;
	}
	public void add()
	{
		Node N=new Node();
		N.add();
		if(isEmpty())
		{
			Root=N;
		}
		else
		{
			Node temp=Root;
			while(!temp.isEmpty())
			{
				temp=temp.Node_Next();
			}
			temp.next=N;
		}
	}
	public void delete()
	{
		if(isEmpty())
		{
			System.out.println("No Item in the List");
		}
		else
		{
			if(Root.isEmpty())
			{
				System.out.println("Processed Element is:-"+Root.get());
				Root=null;
			}
			else
			{
				Node temp=Root,temp1=Root;
				while(!temp.isEmpty())
				{
					temp1=temp;
					temp=temp.Node_Next();
				}
				temp1.set();
				System.out.println("Processed Element is :-"+temp.get());
			}
		}
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("No Item Found");
		}
		else
		{
			Node temp=Root;
			while(!isEmpty(temp))
			{
				System.out.print(temp.get()+"\t");
				temp=temp.Node_Next();
			}
		}
	}

	public Boolean isEmpty(Node temp)
	{
		return (temp==null);
	}
	public Boolean isEmpty()
	{
		return (Root==null);
	}
}
class DS_End_LL_java
{
	public static void main(String [] args)
	{
		LinkList_End obj=new LinkList_End();	
		int ch;
		do
		{
			System.out.println("\n1.)Add the Element\n2.)Delete the Element\n3.)Display the List\nEnter your choice:- ");
			ch=(new Scanner(System.in)).nextInt();
			switch(ch)
			{
				case 1:obj.add();break;
				case 2:obj.delete();break;
				case 3:obj.display();break;
				case 0:System.exit(0);break;
				default:System.out.println("Invalid Choice");
			}	
		}while(ch!=0);
	
	}
}

		
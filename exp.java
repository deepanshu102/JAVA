import java.lang.*; 
  
class Geeks { 
  
    public static void main(String[] args) 
    { 
  
        Integer [] ar={2,4,6,0,8,12};
	int k=24;
		for(int i=0;i<ar.length;i++)
		{
	try
	{
	//	for(int i=0;i<ar.length;i++)
			System.out.println(k/ar[i]);
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}}

    } 
} 

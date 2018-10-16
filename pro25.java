class Pro25
{
        public static void main(String [] args)
        {
                char [][]a= new char[7][];
                a[0]=new char [1];
                a[1]=new char[2];
                a[2]=new char[3];
                a[3]=new char[4];
                a[4]=new char[5];
                a[5]=new char[6];
                a[6]=new char[7];
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
				a[i][j]='*';
		}
		for(i=0;i<a.length;i++)
		{
			for(char k:a[i])
				System.out.print(k);
			System.out.println();	
		}
		for(i=0;i<a.length;i+=2)
		{
			for(char k:a[i])
				System.out.print(k);
			System.out.println();
		}
		for(i=4;i>=0;i-=2)
		{
			for(char k:a[i])
				System.out.print(k);
			System.out.println();
		}
	
	 }
}


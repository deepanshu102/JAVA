class Pro20
{
        public static void main(String [] args)
        {
                int len=args.length;
                int sum=0;
                if(len>0)
                {
                        for(String k:args)
                                sum+=Integer.parseInt(k);
                        System.out.println("Average is - "+(float)sum/len);
                }
		else
		{
			System.out.println("Can not find the average you pass 0 value");
		}
        }
}

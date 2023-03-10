class exception1{

		public static void main(String args[])
	{
		
		int a=15,b=10,c;
		try
		{
		c=a/b; 
		System.out.println(c);
			}
		catch(ArithmeticException e){
				System.out.println(e);
			}

		System.out.println("Thank you");
	}

}
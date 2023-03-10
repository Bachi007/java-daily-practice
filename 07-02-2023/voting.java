import java.util.Scanner;
class voting{

		public static void main(String args[])
	{
		Scanner bs=new Scanner(System.in);
		String username;int age;
		System.out.println("\t\t---------Online Voting System----------");
		//reading user inputs
		System.out.println("Enter full name");
		username=bs.nextLine();
		System.out.println("Enter age");
		age=bs.nextInt();
		try
		{
			if(checkAge(age))//if checkage returns true then  block of code executes
				{               
					System.out.println("Eligible to vote");
				}
		}
	catch(Exception e)
		{
		System.out.println(e);//catching user defined exception
		}
		finally{
			System.out.println("Thanks for your time");
			//we can execute this in all the cases like if we have error or no error
		}
	}
	public static boolean checkAge(int age) throws ArithmeticException//this method may throw an exception so we declared exception
	{
		if(age>18)
			{
				return true;
			}
			else{
					throw new ArithmeticException("Error: user age is not enough to vote");
					//throwing user defined exception
			}

	}
}

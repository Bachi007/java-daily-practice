import java.util.*;
class dayOfWeek
{
	public static void main(String args[])
	
	{
		Scanner bs=new Scanner(System.in);
		System.out.println("Enter a number");
		int day=bs.nextInt();
		
		if(day==1 || day==8)
			{
				System.out.println("it is sunday");
			}
		else if(day==2 || day==9)
			{
				System.out.println("it is Monday");
			}
		else if(day==3)
			{
				System.out.println("it is Tuesday");
			}
		else if(day==4)
			{
				System.out.println("it is Wednesday");
			}
		else{
				System.out.println("Invalid day");
			}




	}


}
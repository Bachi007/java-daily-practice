import java.util.Scanner;
class switchEx{

	public static void main(String args[])
	{
		Scanner bs=new Scanner(System.in);
		System.out.println("Enter a number");
		int day=bs.nextInt();
		
		System.out.println(
			switch(day)
		{
			case 1,8->"sunday";
			
			case 2,9->"Monday";

			case 3,10->"Tuesday";
			
			case 4->"Wednesday";

			case 5->"Thursday";
			
			case 6->"Friday";
		
			case 7->"Saturday";
			
			default->"Invalid";
		}
		);

	}

}
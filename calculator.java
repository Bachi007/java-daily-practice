import java.util.Scanner;
class calculator{

	public static void main(String args[])
	{
		int a,b;
		Scanner bs=new Scanner(System.in);
		calculator cal=new calculator();
		System.out.println("Enter a value");
		a=bs.nextInt();
		System.out.println("Enter b value");
		b=bs.nextInt();
		
		int add=cal.addition(a,b);
		cal.subtract(a,b);
		System.out.println("sum : "+add);
	}

	public int addition(int a,int b)
	{
			return a+b;
	}
	public void subtract(int a,int b)
	{
		System.out.println("subtraction is "+(a-b));
	}

}
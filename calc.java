import java.util.Scanner;
class calc{

	public static void main(String args[])
	{
		Scanner bs=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=bs.nextInt();	
		System.out.println("Enter second number");
		int num2=bs.nextInt();	
		System.out.println("Select operation : \n press 1 for addition\n press 2 for subtract\n press 3 for multiply");
		int op=bs.nextInt();	
	System.out.println(
		switch(op){
		case 1->num1+num2;
		case 2->num1-num2;
		case 3->num1*num2;
		default->"Invalid";
		}
		);
		


}
}
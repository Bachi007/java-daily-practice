import java.util.Scanner;
class evenInArray
{

		public static void main(String args[])
{
		int sum=0,i;
		//scanner object
		Scanner bs=new Scanner(System.in);
		System.out.println("Enter num of elements in array");
		int ns=bs.nextInt();//reading length of array
		
		int arr[]=new int[ns];//creating array of specific size
		
		System.out.println("Hey pls enter array values");
		for(i=0;i<ns;i++)
		{
			arr[i]=bs.nextInt();//reading array values
		}

		System.out.println("Even nums in array ");
		for(int dummy:arr)
		{
			if(dummy%2==0)//checking for even
				System.out.println(dummy);

		}
		








}

}
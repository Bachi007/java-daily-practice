import java.util.*;
import java.util.stream.*;
class mylist4{

	public static void main(String args[])
	{
		List<Integer> ln=Arrays.asList(5,6,7,9,12,8,10);
		//int sum=0;
		/*for(int i:ln)
		{
			if(i%2==0)
				sum+=i;
		}
		System.out.println(sum);
		*/
		
int sum=ln.stream().filter(a->a%2==0).reduce(0,(x,y)->x+y);
		System.out.println(sum);
		
		
		
		
		}
		
	}
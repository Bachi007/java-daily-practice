import java.util.*;
import java.util.stream.*;
class mylist2{

	public static void main(String args[])
	{
		List<Integer> ln=Arrays.asList(5,6,7,9,12,8,10);
			
			//for(int i:ln)
				//System.out.println(i*5);
		ln.stream().map(a->a*5).forEach(System.out::println);
	
	}
}
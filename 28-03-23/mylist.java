import java.util.*;
import java.util.stream.*;
class mylist{

	public static void main(String args[])
	{
		List<String> ln=Arrays.asList(5,6,7,9,12,8,10);
		
		//for(int a:ln)
		//{
		//	if(a%2==0)
			//	System.out.println(a);
		//}
		
		ln.stream().filter(i->i%2==0).forEach(System.out::println);
	}


}

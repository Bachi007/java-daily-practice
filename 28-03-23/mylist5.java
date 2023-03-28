import java.util.*;
import java.util.stream.*;
class mylist5{

	public static void main(String args[])
	{
		List<Integer> ln=Arrays.asList(5,6,7,9,12,8,10);
		
		ln.stream().sorted().forEach(System.out::println);
		
		}
		
		}
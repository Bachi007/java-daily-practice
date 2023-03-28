import java.util.*;
import java.util.stream.*;
class mylist3{

	public static void main(String args[])
	{
		
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int i=1;i<=50;i++)
			al.add(i);
		
	List<Integer> evenal=al.stream().filter(i->i%2==0)
							.collect(Collectors.toList());
		System.out.println(evenal);
		
		
		
		
		
		
		//ArrayList<Integer> evenal=new ArrayList<>();
		
		/*for(int a:al)
		{
			if(a%2==0)
			{
			evenal.add(a);
			}
		}*/
		
		//System.out.println(evenal);
		
		
	}
}
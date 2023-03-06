import java.util.*;
class stringtoken
{

	public static void main(String bs[])
	{

		StringTokenizer st=new StringTokenizer("bhaskara is a great human being who is working in java");
		while(st.hasMoreTokens())
		{	
			System.out.println(st.nextToken());	
		}

	}


}
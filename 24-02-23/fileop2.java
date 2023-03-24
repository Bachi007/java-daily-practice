import java.io.*;
import java.util.*;
class fileop2
{
	public static void main(String args[])
	{
		try
		{
		File f1=new File("D:sample.txt");//file declaration
		Scanner bs=new Scanner(f1);//creating a scanner to read the data from file
		while(bs.hasNextLine())//checking the file whether the data is existed or not
		{
		
			String data=bs.nextLine();
			System.out.println(data);//printing the data from file
		
		}
		}
		catch(Exception e){System.out.println(e);}
		
		
		

	
	}
}
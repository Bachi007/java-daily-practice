import java.io.*;
import java.util.*;
class fileop3
{
	public static void main(String args[])
	{
		try
		{
			
			File f1=new File("D:aboutbhaskara.txt");//file declaration
			Scanner bs=new Scanner(System.in);
			if(f1.createNewFile())//file creation
			{
				System.out.println("Enter data to store");
				String data=bs.nextLine();//reading data from user
				//object of fileWrite to write data to the file
				FileWriter fw=new FileWriter("D:aboutbhaskara.txt");
				fw.write(data);//writing the data
				fw.close();//closing the fileWriter
			}
			else{
				System.out.println("Error: file already existed");
			}
			
			
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	}
}
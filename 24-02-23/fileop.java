import java.io.*;
class fileop
{
	public static void main(String args[])
	{
	
		try
		{
		File f1=new File("D:sample.txt");//declaration of a file
		if(f1.createNewFile())//creating new file
		{
			//file created successfully
			System.out.println("file is create");
		}
		else{
			//file not created
			System.out.println("file is already exisitedd");
		}
		}
		catch(Exception e)
		{
			//some exceptions are raised
			System.out.println(e);
		}
	
	}


}

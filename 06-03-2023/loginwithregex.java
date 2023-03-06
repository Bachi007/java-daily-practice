import java.util.Scanner;
import java.util.regex.*;
class loginwithregex
{
	public static void main(String args[])
	{

		Scanner bs=new Scanner(System.in);
		String username,pwd;
		System.out.println("-----------Login Page-----------");
		System.out.println("Enter username : ");
		username=bs.nextLine();
		System.out.println("Enter Password : ");
		pwd=bs.nextLine();

		if(Pattern.matches("[a-zA-Z@]{4,}",username))//checking for username
		{
			if(Pattern.matches("[a-zA-Z0-9]{6,}",pwd))//checking for password
				{
					if(pwd.equals("123456789"))//comparing password
						{
							System.out.println("Login success");
						}
						else{
								System.out.println("wrong password");
							}	
				}
				else{
				System.out.println("password is not valid");
				}
		}
		else{
				System.out.println("username is not valid");
			}


	}

}

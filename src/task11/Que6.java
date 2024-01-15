package task11;

import java.util.Scanner;

public class Que6 {

public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
		
	System.out.print("Enter your username: ");
	String username=sc.nextLine();
		
	System.out.print("Enter your password: ");
	String password=sc.nextLine();
		
	String message = login(username, password);
		
	System.out.println(message);
		
	}
	
public static String login(String username, String password) {
		
	String userName="haticetin";
	String Password="23B23a2y";
	String message;
		
	if(username.equals(password) && password.equals("")) 
	{
		message = "UserName and Password Fields cannot be empty!";
		
	} else if(username.equals("") && !password.equals(""))
	{
		message = "Username cannot be empty!";
	}else if(!username.equals("") && password.equals("")) 
	{
		message = "Password cannot be empty";
	}else if(!username.equals(userName) || !password.equals(Password))
	{
		message = "Username or password is not valid. Please verify!";
	}else
	{
		message = "User logged in successfully :)";
	}
	return message;
    }
}
--------------------------------------------------------------------------------------------------------------
OUTPUT A:
Enter your username: MYGUVI
Enter your password: WEBGUVI123
Username or password is not valid. Please verify!

OUTPUT B:
Enter your username: haticetin
Enter your password: 23B23a2y
User logged in successfully :)


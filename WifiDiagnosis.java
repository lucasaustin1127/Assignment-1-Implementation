import java.io.*;
public class WifiDiagnosis

{
public static void main(String[] args) throws IOException
	{
		
	System.out.println ("If you have a problem with internet connectivity, this WiFi Diagnosis might work." + "\n");
	
	System.out.println ("Reboot the computer and try to connect." + "\n");
	
	System.out.println ("Did that fix the problem?" + "\n");
	
	String answer;
	
	BufferedReader consoleInput = new BufferedReader (new InputStreamReader (System.in));
	
	answer = consoleInput.readLine();
	
	if (answer.equalsIgnoreCase("Yes"))
	{
		System.out.println ("Enjoy your internet! :)" + "\n");
	}
	
	if (answer.equalsIgnoreCase("No"))
	{
		System.out.println ("Reboot the router and try to connect." + "\n");
		
		System.out.println ("Did that fix the problem?" + "\n");
	
	answer = consoleInput.readLine();
	
	if (answer.equalsIgnoreCase("Yes"))
	{
		System.out.println ("Enjoy your internet! :)" + "\n");
	}
	
	if (answer.equalsIgnoreCase("No"))
	{
		System.out.println ("Make sure the cables connecting the router are firmly plugged in and power is getting to the router." + "\n");
		
		System.out.println ("Did that fix the problem?" + "\n");
		
		answer = consoleInput.readLine();
		
		if (answer.equalsIgnoreCase("Yes"))
	{
		System.out.println ("Enjoy your internet! :)" + "\n");
	}
	
	if (answer.equalsIgnoreCase("No"))
	{
		System.out.println ("Move the computer closer to the router and try to connect." + "\n");
		
		System.out.println ("Did that fix the problem?" + "\n");
		
		answer = consoleInput.readLine();
		
		if (answer.equalsIgnoreCase("Yes"))
	{
		System.out.println ("Enjoy your internet! :)" + "\n");
	}
	
	if (answer.equalsIgnoreCase("No"))
	{
		System.out.println ("Contact your Internet Service Provider (ISP)." + "\n");
		
	}
	
}
}
}
	System.out.println ("Thank you for testing my program!" + "\n" + "Programmer: Lucas Austin" + "\n" + "CMSC203 Assignment 1 Implementation" + "\n" + "Due Date: 9/14/2020" + "\n");
}
}